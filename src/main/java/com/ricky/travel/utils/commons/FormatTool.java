package com.ricky.travel.utils.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTool {
    public static String formatDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formatTime=sdf.format(date);

        return formatTime;
    }
}
