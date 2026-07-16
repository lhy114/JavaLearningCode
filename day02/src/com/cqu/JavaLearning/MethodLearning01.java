package com.cqu.JavaLearning;

import java.util.Scanner;

public class MethodLearning01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        System.out.println("圆的面积为："+getCircleArea(r));
    }

    public static double getCircleArea(double r){
        return Math.PI * r * r;
    }
}
