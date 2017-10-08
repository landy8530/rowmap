/**
* 版权所有：福建邮科电信业务部厦门研发中心 
*====================================================
* 文件名称: MapUtil.java
* 修订记录：
* No    日期				作者(操作:具体内容)
* 1.    2013-8-25			liuyuanxian(创建:创建文件)
*====================================================
* 类描述：(说明未实现或其它不应生成javadoc的内容)
* 
*/
package org.lyx.rowmap.utils;

import java.util.HashMap;
import java.util.Map;

import org.lyx.rowmap.cache.AttrCol;

public class MapUtil<T> {
	
	private static class SingletonHolder {
		static final MapUtil instance = new MapUtil();
	}
	
	public static MapUtil getInstance() {
		return SingletonHolder.instance;
	}
	
	/**
	 * 根据列属性，把jdbc直接查询出来的model（map类型,以字段名为key）转成以属性名为key的Map
	 * @param acArr
	 * @param modelMap
	 * @return
	 * @author liuyuanxian
	 */
	public  Map<String,T> convertToMap(AttrCol[] acArr,Map<String,T> modelMap) {
		Map<String,T> rtnMap = new HashMap<String,T>();
		
		if(modelMap == null) return rtnMap;
		
		for (int i = 0; i < acArr.length; i++) {
		     String columnName = acArr[i].getColumnName().toUpperCase();
		     String attrName = acArr[i].getAttributeName();
		     if(modelMap.containsKey(columnName)) {
		    	 rtnMap.put(attrName, modelMap.get(columnName));
		     }
		 }
		return rtnMap;
	}
}
