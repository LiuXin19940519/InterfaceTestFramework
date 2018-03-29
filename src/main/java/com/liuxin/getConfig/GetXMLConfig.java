package com.liuxin.getConfig;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class GetXMLConfig {
    /**
     * 获取文件的document对象，然后获取对应的根节点
     * @author chenleixing
     */
    public static void main(String [] args){
        try {
            SAXReader saxReader = new SAXReader();
            File xmlFile = new File("E:\\JAVA\\InterfaceTestFramework\\src\\main\\resources\\config.xml");
            Document document = saxReader.read(xmlFile);
            Element root = document.getRootElement();
            List<Element> va = root.elements("user");
            //List<Node> user = root.selectNodes("user");

            for (Element n :va){
                Attribute a =n.attribute("editor");
                String c=a.getName();
                String d = a.getValue();
                Attribute b =n.attribute("date");
                System.out.println(a+ "  " +c +"的值为：" + d);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
