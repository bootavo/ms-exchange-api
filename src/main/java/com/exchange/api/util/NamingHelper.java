package com.exchange.api.util;

public class NamingHelper {

    public static String getMethodName(){
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

}
