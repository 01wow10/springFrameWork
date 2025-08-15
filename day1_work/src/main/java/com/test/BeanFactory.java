package com.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.lang.reflect.Method;
import java.util.List;

public class BeanFactory {
    public static Object getBean(String id) throws Exception {
        SAXReader reader = new SAXReader();
        Document doc = reader.read("F:\\springFramwork\\day1_work\\src\\main\\resources\\teacher-config.xml");
        Element beanElement = (Element) doc.getRootElement()
                .selectSingleNode("//bean[@id='" + id + "']");
        Class<?> clazz = Class.forName(beanElement.attributeValue("class"));
        Object obj = clazz.getConstructor().newInstance();
        List<Element> properties = beanElement.elements("property");
        for (Element prop : properties) {
            String name = prop.attributeValue("name");
            String value = prop.attributeValue("value");
            String methodName = "set" +
                    name.substring(0, 1).toUpperCase() +
                    name.substring(1);
            Method method = clazz.getMethod(methodName, String.class);
            method.invoke(obj, value);
        }

        return obj;
    }
}