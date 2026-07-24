package com.cqu.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parse = sdf.parse("2000-11-11");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf2.format(parse));
    }
}
