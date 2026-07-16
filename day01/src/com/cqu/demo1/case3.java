package com.cqu.demo1;

import java.util.Scanner;

public class case3 {
    public static void main(String[] args) {
        System.out.println("请输入被除数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入除数：");
        int b = sc.nextInt();

//        int i = 0, temp = 0;
//        while(temp < a){
//            i++;
//            temp = b * i;
//        }
//
//        if (a==temp){
//            System.out.println("商为："+i+";余数为:0");
//        }else{
//            temp -= b; i -= 1;
//            System.out.println("商为："+i+";余数为:"+(a-temp));
//        }


        // 参考代码
        int count = 0;
        while(a>=b){
            a -= b;
            count++;
        }

        System.out.println("商为："+count+";余数为:"+a);
    }
}

