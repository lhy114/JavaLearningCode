package com.cqu.StringTest;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:(要求1-长度小于等于9；2-只能是数字)");
        String str = sc.next();

        if (str.length()>9||str.length()<1){
            System.out.println("输入的字符串不符合要求");
        }else{
            for (int i = 0; i < str.length(); i++) {
                if (!(str.charAt(i)>='0'&&str.charAt(i)<='9')){
                    System.out.println("输入的字符串不符合要求");
                    break;
                }
            }
        }

        System.out.println(toRomanNumerals(str));
    }

    public static String toRomanNumerals(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case '0':
                    sb.append(" ");
                    break;
                case '1':
                    sb.append("I ");
                    break;
                case '2':
                    sb.append("II ");
                    break;
                case '3':
                    sb.append("III ");
                    break;
                case '4':
                    sb.append("IV ");
                    break;
                case '5':
                    sb.append("V ");
                    break;
                case '6':
                    sb.append("VI ");
                    break;
                case '7':
                    sb.append("VII ");
                    break;
                case '8':
                    sb.append("VIII ");
                    break;
                case '9':
                    sb.append("IX ");
                    break;
            }
        }

        return sb.toString();
    }
}
