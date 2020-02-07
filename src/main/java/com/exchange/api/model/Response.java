package com.exchange.api.model;

import java.util.List;

public class Response {

    public String id;
    public String http_method;
    public String resource;
    public int code;
    public String message;
    public String description;
    public List<Object> data;

}
