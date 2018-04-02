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
        RequestConfig requestConfig = new RequestConfig();
        try {
            SAXReader saxReader = new SAXReader();
            File xmlFile = new File("E:\\JAVA\\InterfaceTestFramework\\src\\main\\resources\\config.xml");
            Document document = saxReader.read(xmlFile);
            Element root = document.getRootElement();
            List<Element> list = root.elements("ServerConfig");
            if (list==null){
                return null;
            }else {
                for (Element attr:list) {
                    if (attr.attribute("RequestName").getValue().equals(RequestName)){
                        requestConfig.setContextType(attr.attribute("ContextType").getValue());
                        requestConfig.setRequestType(attr.attribute("RequestType").getValue());
                        requestConfig.setContextLength(attr.attribute("RequestLength").getValue());
                        return requestConfig;
                    }
                    else {
                        continue;
                    }
                }
            }

        }catch (Exception e){
             e.printStackTrace();
        }finally {
            return null;
        }
    }
}



