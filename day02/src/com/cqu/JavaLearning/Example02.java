package com.cqu.JavaLearning;

public class Example02 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)){
                System.out.println(i+"是素数");
                count++;
            }
        }

        System.out.printf("一共有"+count+"个素数");
    }

    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        } else{
            for (int i = 2; i <= number/2; i++){
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
