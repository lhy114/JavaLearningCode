package com.cqu.JavaLearning;

import java.sql.PreparedStatement;
import java.util.Random;

public class MethodLearning03 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i]+" ");
        }

        int from = 1, to = 5;
        System.out.println("将arr的数组的从【1,5)进行复制并进行返回");

        int[] copy = copyOfRange(arr, from, to);
        System.out.println("复制后的数组为：");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+" ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int length = to - from;
        int[] results = new int[length];
        for (int i = 0; i < length; i++) {
            results[i] = arr[from+i];
        }

        return results;
    }
}
