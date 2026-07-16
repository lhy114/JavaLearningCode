package com.cqu.JavaLearning;

import java.util.Random;

public class ArrayLearning04 {
    public static void main(String[] args) {
        /*
         * 随机打乱数组
         * */
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
             int index = r.nextInt(arr.length);
             int temp = arr[index];
             arr[index] = arr[i];
             arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
