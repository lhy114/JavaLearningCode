package com.cqu.JavaLearning;

import java.util.Random;

public class Example03 {
    public static void main(String[] args) {
        //随机生成一个5位的验证码，验证码的格式：前4为为大写字母或者小写字母，最后一位为数字

        String code = "";
        for (int i = 0; i<5 ; i++){
            if(i!=4){
                code += randomChar();
            }else{
                Random r = new Random();
                int digit = r.nextInt(10);
                code += digit;
            }
        }

        System.out.println(code);
    }

    public static char randomChar(){
        Random r = new Random();
        int choice = r.nextInt(2);
        if (choice == 0){
            char upper = (char)(r.nextInt(26) + 'A');
            return upper;
        }else{
            char lower = (char)(r.nextInt(26) + 'a');
            return lower;
        }
    }
}
