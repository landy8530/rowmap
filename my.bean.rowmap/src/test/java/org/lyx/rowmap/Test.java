package org.lyx.rowmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lyx.rowmap.cache.AttrCol;
import org.lyx.rowmap.cache.AttrColMapCache;
import org.lyx.rowmap.cache.AttrColMapInfo;
import org.lyx.rowmap.handler.BeanPropertyRowMapperHandler;
import org.lyx.rowmap.init.AttrColInit;


public class Test {

	public static void main(String[] args){
		testConvert();
	}
	
	private static void testConvert() {
		testInit();
		//初始数据
		List<Map<String,Object>> beanList = initData();
		
		List<TCustomer> custList = new BeanPropertyRowMapperHandler<TCustomer>(TCustomer.class).toBeanList(beanList);
		
		if(custList != null) {
			System.out.println(custList.size());
			
			for(TCustomer cust : custList) {
				System.out.println("custName:" + cust.getName() + ",custAddr:" + cust.getAddress()) ;
			}
			
		}
		
	}
	
	private static List<Map<String,Object>> initData() {
		//测试数据,模拟数据库查出来的list数据是MAP类型的
		List<Map<String,Object>> beanList = new ArrayList<Map<String,Object>>();
		for(int i=0;i<10;i++) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("CUSTOMER_ID", "1");
			map.put("ACCOUNT_ID", "2");
			map.put("ORG_ID", "SH9890808");
			map.put("PROVINCE_CUSTOMER_ID", "testPrivcidasjf");
			map.put("H_ID", 44);
			map.put("NAME", "测试客户");
			map.put("ADDRESS", "上海西藏南路");
			beanList.add(map);
		}
		return beanList;
	}
	
	private static void testInit() {
		try {
//			System.out.println(Test.class.getName());
			AttrColInit.init();
			
			Map cache = AttrColMapCache.getCache();
			System.out.println("size:" + cache.size());
			
			if(cache!=null&&!cache.isEmpty()){
		    	Iterator   ithead   =   cache.entrySet().iterator();  
		    	while(ithead.hasNext()) {  
					  Map.Entry   entry   =   (Map.Entry)ithead.next();     
					  String   key   =   (String) entry.getKey();  
					  AttrColMapInfo   value   =   (AttrColMapInfo) entry.getValue();
					  
					  System.out.println(key + "----------" + value);
					  
		    	}
		    }
			
			AttrColMapInfo mapInfo = AttrColMapCache.get(TCustomer.class);
			AttrCol[] colList = mapInfo.getAttrColList();
			for(AttrCol ac : colList) {
				System.out.println("属性名称：" + ac.getAttributeName() + ",字段名称：" + ac.getColumnName() + ",字段类型：" + ac.getType());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
