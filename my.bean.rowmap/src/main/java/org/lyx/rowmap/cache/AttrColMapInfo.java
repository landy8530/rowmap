package org.lyx.rowmap.cache;


public class AttrColMapInfo {
	private String beanClass;
	private AttrCol[] attrColList;
	
	public AttrColMapInfo(String beanClass, AttrCol[] attrColList) {
		this.beanClass = beanClass;
		this.attrColList = attrColList;
	}
	public String getBeanClass() {
		return beanClass;
	}
	public void setBeanClass(String beanClass) {
		this.beanClass = beanClass;
	}
	public AttrCol[] getAttrColList() {
		return attrColList;
	}
	public void setAttrColList(AttrCol[] attrColList) {
		this.attrColList = attrColList;
	}
	
	
}
