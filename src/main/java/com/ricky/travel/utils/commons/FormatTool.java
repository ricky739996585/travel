package com.ricky.travel.utils.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTool {
    /**
      * @author:ricky
      * 功能:date转字符串日期
      * 时间:2018/4/7 0007 11:34
      */
    public static String formatDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formatTime=sdf.format(date);

        return formatTime;
    }
    /**
      * @author:ricky
      * 功能:中文转Unicode编码
      * 时间:2018/4/7 0007 11:35
      */
    public static String cnToUnicode(String gbString) {   //gbString = "测试"
        char[] utfBytes = gbString.toCharArray();   //utfBytes = [测, 试]
        String unicodeBytes = "";
        for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {
            String hexB = Integer.toHexString(utfBytes[byteIndex]);   //转换为16进制整型字符串
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        System.out.println("unicodeBytes is: " + unicodeBytes);
        return unicodeBytes;
    }
    /**
      * @author:ricky
      * 功能:Unicode转中文
      * 时间:2018/4/7 0007 11:37
      */
    public static String unicodeToCn(String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }
}
