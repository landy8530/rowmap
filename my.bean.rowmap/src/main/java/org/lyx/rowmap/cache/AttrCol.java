package org.lyx.rowmap.cache;

import java.beans.PropertyDescriptor;

/**
 * 实体bean对应的hibernate注解中的属性类
 * @author liuyuanxian
 *
 */
public class AttrCol {
	/**
	 * 属性名称
	 */
	private String attributeName;
	/**
	 * 对应数据库字段的名称
	 */
	private String columnName;
	/**
	 * 对应的数据类型
	 */
	private String type;
	/**
	 * 对应的属性描述对象。保存这个对象，以便后面直接拿来用，就不用重新更新属性类型去获取相应的method对象
	 */
	private PropertyDescriptor setter;
	
	public AttrCol(String attributeName, String columnName, String type) {
		this.attributeName = attributeName;
		this.columnName = columnName;
		this.type = type;
	}
	
	public AttrCol(String attributeName, String columnName, PropertyDescriptor setter) {
		this.attributeName = attributeName;
		this.columnName = columnName;
		this.setter = setter;
	}
	
	public AttrCol(String attributeName, String columnName) {
		this(attributeName, columnName, "");
	}
	
	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public PropertyDescriptor getSetter() {
		return setter;
	}

	public void setSetter(PropertyDescriptor setter) {
		this.setter = setter;
	}
	
	
}
