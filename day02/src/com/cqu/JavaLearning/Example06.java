package com.cqu.JavaLearning;

import java.util.Random;

public class Example06 {
//    public static void main(String[] args) {
//        int[] arr = {2, 588, 888, 1000, 10000};
//        boolean[] flag = new boolean[arr.length];
//
//        Random r =  new Random();
//        for(int i = 0; i < arr.length; i++){
//            int id = r.nextInt(arr.length);
//            if(flag[id] == true){
//                while(flag[id] == true){
//                    id = r.nextInt(arr.length);
//                }
//            }
//            System.out.println(arr[id]+"元的奖金被抽出");
//            flag[id] = true;
//        }
//    }


    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();

        // Fisher-Yates 洗牌：从后往前，每个位置和前面随机位置交换
        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);   // 0 ~ i 之间的随机位置
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        // 洗完后，arr 已经是随机排列了，按顺序输出即可
        for (int v : arr) {
            System.out.println(v + "元的奖金被抽出");
        }
    }

//    public static void main(String[] args) {
//    不符合数学上的分布
//        int[] arr = {2, 588, 888, 1000, 10000};
//        Random r = new Random();
//
//        for (int i = 0; i < arr.length; i++) {
//            int randomIndex = r.nextInt(arr.length);
//            int temp = arr[randomIndex];
//            arr[randomIndex] = arr[i];
//            arr[i] = temp;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

}



