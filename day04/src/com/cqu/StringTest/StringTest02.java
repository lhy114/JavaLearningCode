package com.cqu.StringTest;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串A:");
        String strA = sc.next();
        System.out.println("请输入一个字符串B:");
        String strB = sc.next();

        if (isMoveEqual(strA, strB)){
            System.out.println("字符串A能够经过移动之后得到字符串B");
        }else{
            System.out.println("字符串A不能够经过移动得到字符串B");
        }
    }

    // 方法一，用Java的contains函数，其实也就是暴力循环匹配
    public static boolean isMoveEqual(String strA, String strB){
        String strC = strA+strA;
        return strC.contains(strB);
    }

    // 方法二，KMP算法
    public static boolean isMoveEqual2(String strA, String strB){
        String strC = strA+strA;
        return true;
    }
}
