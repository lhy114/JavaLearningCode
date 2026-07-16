package com.cqu.JavaLearning;

public class MethodLearning02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        System.out.println(getArrMax(arr));
        System.out.println(isExist(arr, 8));
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int getArrMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    public static boolean isExist(int[] arr, int query){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==query){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
