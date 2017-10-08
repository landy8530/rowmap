/**
* 版权所有：福建邮科电信业务部厦门研发中心 
*====================================================
* 文件名称: StringUtil.java
* 修订记录：
* No    日期				作者(操作:具体内容)
* 1.    2013-4-28			刘渊先(创建:创建文件)
*====================================================
* 类描述：(说明未实现或其它不应生成javadoc的内容)
* 
*/
package org.lyx.rowmap.utils;

public class StringUtil {
	private StringUtil() {
	};

	/**
	 * 判断字符串是否为空
	 */
	public static boolean isEmpty(String str) {
		if (str == null || str.length() <= 0 || str.trim() == null
				|| str.trim().length() <= 0) {
			return true;
		}
		return false;
	}

	/**
	 * 判断字符串是否不为空
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
}