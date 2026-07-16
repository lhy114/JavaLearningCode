package com.cqu.demo1;

import java.util.Scanner;

public class WhileLearning {
    public static void main(String[] args) {

        System.out.println("输入数值");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int result = 0;

        while (temp > 0) {
            result = result * 10 + temp % 10;
            temp /= 10;
        }

        if(result==number){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
