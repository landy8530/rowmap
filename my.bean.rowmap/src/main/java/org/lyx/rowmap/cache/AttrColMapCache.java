package org.lyx.rowmap.cache;

import java.util.HashMap;
import java.util.Map;

public class AttrColMapCache {
	private static Map<String,AttrColMapInfo> cache = new HashMap<String,AttrColMapInfo>();
	
	public static void add(AttrColMapInfo info) {
		cache.put(info.getBeanClass(), info);
	}
	
	public static AttrColMapInfo get(String mapKey) throws Exception {
		if (cache.containsKey(mapKey)) {
			return (AttrColMapInfo)cache.get(mapKey);
		}
		throw new Exception(mapKey + "绑定信息没找到.");
	}
	
	public static AttrColMapInfo get(Class info) throws Exception {
		return get(info.getName());
	}
	
	public static void clear() {
		cache.clear();
	}
	
	public static Map<String,AttrColMapInfo> getCache() {
		return cache;
	}
}
