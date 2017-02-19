package com.itcuc.base.util;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.itcuc.base.bean.Icon;

public class IconUtils {
	public static List<Icon> getIconList() throws Exception{
		List<Icon> iconList = new ArrayList<>();
		SAXReader reader = new SAXReader();
		Document document = reader.read(IconUtils.class.getClassLoader().getResourceAsStream("icons.xml"));
		Element root = document.getRootElement();
		List<Element> list = root.elements();
		for(Element e:list){
			String name = e.getTextTrim();
			String style = e.element("i").attributeValue("class");
			Icon icon = new Icon(name,style);
			iconList.add(icon);
		}
		return iconList;
	}
}
