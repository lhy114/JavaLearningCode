package com.cqu.StringLearning;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//        int upperCount = 0;
//        int lowerCount = 0;
//        int numberCount = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch>='A'&&ch<='Z'){
//                upperCount++;
//            }else if (ch>='a'&&ch<='z'){
//                lowerCount++;
//            }else if (ch>='0'&&ch<='9'){
//                numberCount++;
//            }
//        }
//
//        System.out.println("大写字母有"+upperCount+"个");
//        System.out.println("小写字母有"+lowerCount+"个");
//        System.out.println("数字有"+numberCount+"个");


        StringBuilder sb = new StringBuilder();
        sb.append("aaa").append("bbbb");
        if (sb.toString().equals("aaabbbb")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
