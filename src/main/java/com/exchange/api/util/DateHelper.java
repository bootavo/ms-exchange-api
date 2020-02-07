package com.exchange.api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public static String getCurrentDate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return formatter.format(date);
    }

}
