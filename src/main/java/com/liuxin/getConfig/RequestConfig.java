package com.liuxin.getConfig;

public class RequestConfig {
    private String ContextType;
    private String RequestType;
    private String ContextLength;

    public String getContextType() {
        return ContextType;
    }

    public void setContextType(String contextType) {
        ContextType = contextType;
    }

    public String getRequestType() {
        return RequestType;
    }

    public void setRequestType(String requestType) {
        RequestType = requestType;
    }

    public String getContextLength() {
        return ContextLength;
    }

    public void setContextLength(String contextLength) {
        ContextLength = contextLength;
    }
}
