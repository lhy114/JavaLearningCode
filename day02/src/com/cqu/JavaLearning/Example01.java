package com.cqu.JavaLearning;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = sc.nextDouble();

        System.out.println("请输入月份");
        int month = sc.nextInt();

        System.out.println("请输入是头等舱还是经济舱");
        String flightType = sc.next();

        System.out.println("你的机票费用为:"+getPrice(price,month,flightType));
    }

    public static double getPrice(double price, int month, String flightType) {
        if (month>=5 && month<=10) {
            price = getPrice(flightType, price, 0.9, 0.85);
        }else if ((month>=9 && month<=12)||(month>=1 && month<=4)) {
            price = getPrice(flightType, price, 0.7, 0.65);
        }else{
            System.out.println("错误的月份");
            price = 0;
        }

        return price;
    }

    // 这是利用ctrl + alt + M 进行抽取的方法
    private static double getPrice(String flightType, double price, double x, double x1) {
        if (flightType.equals("头等舱")) {
            price = price * x;
        } else if (flightType.equals("经济舱")) {
            price = price * x1;
        } else {
            System.out.println("没有这种位置");
            price = 0;
        }
        return price;
    }
}
