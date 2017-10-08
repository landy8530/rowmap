/**
* 版权所有：福建邮科电信业务部厦门研发中心 
*====================================================
* 文件名称: MyBeanPropertyRowMapperHandler.java
* 修订记录：
* No    日期				作者(操作:具体内容)
* 1.    2013-8-25			liuyuanxian(创建:创建文件)
*====================================================
* 类描述：(说明未实现或其它不应生成javadoc的内容)
* 
*/
package org.lyx.rowmap.handler;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.lyx.rowmap.cache.AttrCol;
import org.lyx.rowmap.cache.AttrColMapCache;
import org.lyx.rowmap.cache.AttrColMapInfo;
import org.lyx.rowmap.utils.MapUtil;


public class BeanPropertyRowMapperHandler<T> {
	private static final Logger logger = Logger.getLogger(BeanPropertyRowMapperHandler.class);
	/** The class we are mapping to */
	private Class<T> mappedClass;
	
	public BeanPropertyRowMapperHandler(Class<T> mappedClass) {
		if(mappedClass == null) {
			logger.info("转化实体bena失败，mappedClass为空!");
			return;
		}
		initialize(mappedClass);
	}
	
	/**
	 * Initialize the mapping metadata for the given class.
	 * @param mappedClass the mapped class.
	 */
	protected void initialize(Class<T> mappedClass) {
		this.mappedClass = mappedClass;
	}
	
	public List<T> toBeanList(List<Map<String,Object>> tempList) {
		List<T> beanList = new ArrayList<T>();
		try {
			AttrColMapInfo mapInfo = AttrColMapCache.get(mappedClass);
			AttrCol[] acArr = mapInfo.getAttrColList();//属性列表
			if(tempList != null) {
				for(Object obj : tempList) {
					 Map<String,T> modelMap = (Map<String,T>)obj;
					 T bo = mappedClass.newInstance();
					 
					 Map<String,Object> rtnMap = MapUtil.getInstance().convertToMap(acArr, modelMap);
					 
					 BeanUtils.populate(bo, rtnMap);
					 beanList.add(bo);
				}
				return beanList;
			}
		}catch(Exception ex) {
			logger.info("转化实体bena时出现异常：" + ex.getMessage());
			ex.printStackTrace();
		}
		return beanList;
	}
	
	
	public List toBeanList(ResultSet resultSet) throws Exception {
		List beanList = new ArrayList();
		while (resultSet.next()) {
		   AttrColMapInfo mapInfo = AttrColMapCache.get(mappedClass);
		   AttrCol[] acArr = mapInfo.getAttrColList();
		   Object bo = mappedClass.newInstance();
		   for (int i = 0; i < acArr.length; i++) {
			     Object value = null;
			     String fieldName = acArr[i].getColumnName();
			     Class param = null;
			     String setMethodName = setMethod(acArr[i].getAttributeName());
			     try {
			    	 String attrType = acArr[i].getType();//属性类型
			    	 if ("java.util.Date".equals(attrType)) {
				    	 param = Date.class;
				    	 value = resultSet.getDate(fieldName);
				     }else if ("java.lang.Double".equals(attrType)) {
				    	 param = Double.class;
				    	 value = resultSet.getDouble(fieldName);
				     } else if ("java.lang.Integer".equals(attrType)) {
				    	 param = Integer.class;
				    	 value = resultSet.getInt(fieldName);
				     } else if ("java.lang.Long".equals(attrType)) {
				    	 param = Long.class;
				    	 value = resultSet.getLong(fieldName);
				     } else if("java.lang.String".equals(attrType)){
				    	 param = String.class;
				    	 value = resultSet.getString(fieldName);
				     }
			    	 if (value != null) {
				           javaSet(bo, bo.getClass().getMethod(setMethodName, 
				             new Class[] { param }), value);
				     }
			     }catch(Exception ex) {
			    	 if(logger.isDebugEnabled())
			    		 logger.debug(acArr[i].getColumnName() + "字段在查询语句里没找到");
			     }
		   }
		   beanList.add(bo);
		}
		return beanList;
	}
	
	private String setMethod(String attr) {
		return "set" + attr.substring(0, 1).toUpperCase() + attr.substring(1, attr.length());
	}
	
	private void javaSet(Object obj, Method method, Object value) throws Exception {
		if (method != null)
			method.invoke(obj, new Object[] { value });
	}
}
