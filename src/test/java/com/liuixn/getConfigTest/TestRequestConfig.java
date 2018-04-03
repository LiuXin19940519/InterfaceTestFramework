package com.liuixn.getConfigTest;

import com.liuxin.getConfig.GetXMLConfig;
import com.liuxin.getConfig.RequestConfig;
import org.junit.Test;

public class TestRequestConfig {
    @Test
    public void test(){

        GetXMLConfig getXMLConfig = new GetXMLConfig();
        RequestConfig requestConfig=getXMLConfig.getRequestConfig("GetWeater");
        System.out.println(requestConfig.toString());
    }
}
