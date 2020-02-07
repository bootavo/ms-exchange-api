package com.exchange.api.util;

public class Constants {

    public String MS_RESOURCE_NAME = getClass().getProtectionDomain().getCodeSource().getLocation().toString();
    public static final String AUTHOR = "gtufnof";

    //Exchange Currency
    public static final String USD = "USD";
    public static final String EUR = "EUR";
    public static final String PEN = "PEN";
    public static final String MXN = "MXN";
    public static final String JPY = "JPY";
    public static final String GBP = "GBP";
    public static final String NOT_DEFINED = "NOT_DEFINED";

    //Http Method
    public static final String HTTP_GET = "GET";
    public static final String HTTP_POST = "POST";
    public static final String HTTP_PUT = "PUT";
    public static final String HTTP_PATCH = "PATCH";
    public static final String HTTP_DELETE = "DELETE";

    public static final int HTTP_OK = 200;
    public static final String HTTP_MSG_OK = "Success";
    public static final String HTTP_DES_OK = "Congratulations";

    public static final int HTTP_CREATED = 201;
    public static final String HTTP_MSG_CREATED = "Success";
    public static final String HTTP_DES_CREATED = "Congratulations";

    public static final int HTTP_CONFLICT = 409;
    public static final String HTTP_MSG_CONFLICT = "Conflicts";
    public static final String HTTP_DES_CONFLICT = "Internal conflicts with some logic business";

    public static final int HTTP_SERVER_ERROR = 500;
    public static final String HTTP_MSG_SERVER_ERROR = "Internal Server Error";
    public static final String HTTP_DES_SERVER_ERROR = "An error has been detected in our internal server";


}
