package com.cqu.JavaLearning;

public class MethodLearning04 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("a改变前:" + a);
        change(a);
        System.out.println("a改变后:" + a);
    }

    public static void change(int number){
        number = 200;
    }
}
