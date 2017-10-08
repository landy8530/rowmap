package org.lyx.rowmap.init;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lyx.rowmap.cache.AttrColMapCache;
import org.lyx.rowmap.parse.AttrColXmlParser;


public class AttrColInit {
	private static final Logger log = Logger.getLogger(AttrColInit.class);
	private static String HIBERNATE_PATH = "/hibernate";
	
	public static void init() {
		AttrColXmlParser x = new AttrColXmlParser();
		//清空缓存，防止重复
		AttrColMapCache.clear();
		try {
			//再加载需解析的文件进行解析操作
			loadByClassPath(x);
		}catch(Exception ex) {
			log.error("初始化失败", ex);
			ex.printStackTrace();
		}
	}
	
	private static void loadByClassPath(AttrColXmlParser x) throws Exception {
		String path = "";
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader != null) {
			String stripped = HIBERNATE_PATH.startsWith("/") ? HIBERNATE_PATH.substring(1) : HIBERNATE_PATH;
			URL rootUrl = classLoader.getResource(stripped);
			if (rootUrl != null) {
				path = URLDecoder.decode(rootUrl.getPath(), "UTF-8");
			}
		}
		
		log.info("hbm.xml path:" + path);
		
		List<File> list = getAllFiles(path);
//		long startTime = System.currentTimeMillis();
	    for (int i = 0; i < list.size(); i++) {
	    	try {
	    		File file = (File)list.get(i);
	    		log.info("mapping file -> " + file.getAbsolutePath());
	    		x.xmlParser(new FileInputStream(file));
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
		}
//	    long endTime = System.currentTimeMillis();
//	    System.out.println("========================= times :" + (endTime-startTime));
	}
	
	private static List<File> getAllFiles(String absoluteDir){
		List<File> files = new ArrayList<File>();
		File parentDir = new File(absoluteDir);
		String[] list = parentDir.list();
		if (list == null) {
			return files;
		}
		for (int i = 0; i < list.length; i++) {
			String s = list[i];
		    String name = absoluteDir + "/" + s;
		    File instance = new File(name);
		    if (instance.isFile()) {
		         if ((name != null) && (name.endsWith(".hbm.xml")))
		        	 files.add(instance);
		    } else 
		    	files.addAll(getAllFiles(name));
		}
		return files;
	}
}
