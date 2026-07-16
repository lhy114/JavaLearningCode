package com.cqu.JavaLearning;

import java.util.Random;

public class ArrayLearning03 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            sum += arr[i];
            System.out.println("第"+(i+1)+"个数据为:"+arr[i]);
        }

        double avg = sum / arr.length;
        System.out.println("所有数据的和为:"+sum);
        System.out.println("所有数据的平均值为:"+avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(avg-arr[i]>0){
                count++;
            }
        }
        System.out.println("所有数据比平均值小的个数为:"+count);
    }
}
