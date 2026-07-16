package com.cqu.demo1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("输入数值");
        Scanner scanner = new Scanner(System.in);
        String noodles = scanner.next();
        switch (noodles){
            case "面1":
                System.out.println("面1");
                break;
            case "面2":
                System.out.println("面2");
                break;
            default:
                System.out.println("其他");
                break;
        }

    }
}
