package com.cqu.demo1;

import java.util.Scanner;

public class case5 {
    public static void main(String[] args) {
        /*
        * 键盘录入一个大于等于2 的整数x，计算并返回x的平方根
        * */

        System.out.println("请输入大于等于2的整数：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 1;
        while(result * result <= x){
            result++;
        }
        result -= 1;
        System.out.println("平方根为："+result);
    }
}
