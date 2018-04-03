package com.liuxin.getConfig;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class GetXMLConfig {

    /**
     * 通过传入的RequestName查找
     * */
    public RequestConfig getRequestConfig(String RequestName){
        RequestConfig requestConfig = null;
        try {
            SAXReader saxReader = new SAXReader();
            File xmlFile = new File("E:\\JAVA\\InterfaceTestFramework\\src\\main\\resources\\config.xml");
            Document document = saxReader.read(xmlFile);
            Element root = document.getRootElement();
            List<Element> list = root.elements("ServerConfig");
            if (list!=null){
                for (Element attr:list) {
                    Element element1=attr;
                    Element element2=attr;
                    Element element3=attr;
                    String temp =attr.attribute("RequestName").getValue();
                    String temp2= element1.attribute("RequestType").getValue();
                    String temp3= element2.attribute("ContextType").getValue();
                    String temp4= element3.attribute("ContextLength").getValue();
                    if (temp2 == null&&"".equals(temp2.trim())){
                        return null;
                    }else {
                        if (temp2.equals(RequestName)){
                            requestConfig.RequestType=temp2;
                            requestConfig.ContextType=temp3;
                            requestConfig.ContextLength=temp4;
                            return requestConfig;
                        }
                        else {
                            continue;
                        }
                    }
                }
            }else {
                return null;
            }
        }catch (Exception e){
             e.printStackTrace();
        }finally {
            return null;
        }
    }
}



