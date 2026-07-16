package com.cqu.demo1;

import java.util.Random;
import java.util.Scanner;

public class case7 {
    public static void main(String[] args) {
        /**
         * 系统随机生成一个数，用户开始随机判断
         * */
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int guess = -1;
        while(guess != number){
            System.out.println("请输入猜测的数字：");
            guess = sc.nextInt();
            if(guess > number){
                System.out.println("猜的数字太大了");
            }else if(guess < number){
                System.out.println("猜的数字太小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }

    }
}
