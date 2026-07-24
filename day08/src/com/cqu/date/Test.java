package com.cqu.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String startTime = "2023年11月11日 0:0:0";
        String endTime = "2023年11月11日 0:10:0";

        String xiaoJia = "2023年11月11日 0:1:0";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long start = sdf1.parse(startTime).getTime();
        long end = sdf1.parse(endTime).getTime();

        long now = sdf1.parse(xiaoJia).getTime();

        if(now>=start&&now<=end){
            System.out.println("符合要求");
        }
    }
}
