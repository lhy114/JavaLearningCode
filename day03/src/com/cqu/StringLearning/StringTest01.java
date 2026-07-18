package com.cqu.StringLearning;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        //字符串的反转
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            newStr = ch + newStr;
        }

        System.out.println(newStr);
    }

}
