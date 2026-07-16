package com.cqu.JavaLearning;

import java.util.Random;

public class Example07 {
    public static void main(String[] args) {
        /*
        * 彩票系统
        * */

        // 随机生成红球和蓝球的中奖号码
        int[] redBolls = randomGenerator(6,1,33);
        int[] bullBolls = randomGenerator(1,1,16);

        printArray(redBolls);
        printArray(bullBolls);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] randomGenerator(int length, int from, int to){
        //注意确保生成的数字是不重复的
        int poolSize = to - from + 1;
        int[] pool = new int[poolSize];
        for (int i = 0; i < pool.length; i++) {
            pool[i] = from + i;
        }

        Random r = new Random();
        for (int i = poolSize - 1; i >= poolSize - length ; i--) {
            int index = r.nextInt(i + 1) ;
            int temp = pool[index];
            pool[index] = pool[i];
            pool[i] = temp;
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = pool[poolSize - length + i];
        }
        return result;
    }
}
