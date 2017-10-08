package org.lyx.rowmap.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.lyx.rowmap.cache.AttrCol;
import org.lyx.rowmap.cache.AttrColMapCache;
import org.lyx.rowmap.cache.AttrColMapInfo;
import org.lyx.rowmap.utils.StringUtil;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class AttrColXmlParser {
	private static Logger logger = Logger.getLogger(AttrColXmlParser.class);
	
	public void xmlParser(InputStream in) throws Exception {
		Document document = getParserDocument(in);
		parser(getRootElement(document));
	}
	/**
	 * 取得需要解析的文档对象
	 * @param in
	 * @return
	 * @throws Exception
	 */
	private static Document getParserDocument(InputStream in) throws Exception {
		SAXReader reader = new SAXReader(false);
		//避免检查dtd,可以加快解析xml文件的速度 20121015 
		reader.setEntityResolver(new EntityResolver() {  
		    String emptyDtd = "";  
		    ByteArrayInputStream bytels = new ByteArrayInputStream(emptyDtd.getBytes());  
		    public InputSource resolveEntity(String publicId, String systemId)   
		           throws SAXException, IOException {  
		        return new InputSource(bytels);  
		    }  
		});  
		
		Document document = reader.read(in);
		
		return document;
	}
	/**
	 * 得到该文档的根节点
	 * @param document
	 * @return
	 */
	private static Element getRootElement(Document document) {
		return document.getRootElement();
	}
	/**
	 * 解析某个根元素
	 * @param elem
	 * @throws Exception
	 */
	private static void parser(Element elem) throws Exception {
		if (elem == null) {
			throw new Exception(" hbm.xml file parser failed.");
	    }
		List<AttrCol> attrList = new ArrayList<AttrCol>();
		Iterator<Element> __attrList = elem.element("class").elementIterator();
		while (__attrList.hasNext()) {
		    Object __attrObj = __attrList.next();
		    if (!(__attrObj instanceof Element))
		        continue;
		    Element __attrEle = (Element)__attrObj;
		    String column = "";//__attrEle.element("column").attributeValue("name");
		    
		    Element colElement = __attrEle.element("column");
		    if(colElement != null) {
		    	column = colElement.attributeValue("name");
		    }
		    
		    if(StringUtil.isNotEmpty(column)) {
		    	AttrCol ac = new AttrCol(__attrEle.attributeValue("name"),column,__attrEle.attributeValue("type"));
//			    System.out.println("++++++++++++++++ Column:" + column + "========================");
//			    System.out.println("++++++++++++++++ attribute:" + __attrEle.attributeValue("name") + "========================");
//			    System.out.println("++++++++++++++++ type:" + __attrEle.attributeValue("type") + "========================");
			    attrList.add(ac);
		    }else
		    	continue;
		}
		logger.info("mapping class -> " + elem.element("class").attributeValue("name"));
	    AttrCol[] arr = new AttrCol[attrList.size()];
	    AttrColMapCache.add(new AttrColMapInfo(elem.element("class").attributeValue("name"), 
	    		 (AttrCol[])attrList.toArray(arr)));
	   }
}
