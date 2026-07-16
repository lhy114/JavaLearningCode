package com.cqu.JavaLearning;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0, total = 0;
        for (int i = 0; i < 6; i++) {
            int score = sc.nextInt();
            total += score;

            // 找到最小值和最大值
            if (i==0){
                max = min = score;
            }else{
                if (score>max){
                    max = score;
                }
                if (score<min){
                    min = score;
                }
            }
        }

        total = total - max - min;

        double average = total / 4.0;
        System.out.println("The total score is: " + total);
        System.out.println("The average is " + average);
    }
}
