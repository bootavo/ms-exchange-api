package com.exchange.api.util;

import java.util.UUID;

public class UUIDHelper {
    public static String getUuid() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public static int getId(){

        int min = 1;
        int max = 999;

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}