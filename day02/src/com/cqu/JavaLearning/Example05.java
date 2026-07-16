package com.cqu.JavaLearning;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码:");
        int code = sc.nextInt();

        int enc_code = encryption(code);
        System.out.println("加密后的密码为:"+enc_code);

        int dec_code = decryption(enc_code);
        System.out.println("解密后的密码为:"+dec_code);
    }

    public static int encryption(int code){
        int enc_code = 0;
        while(code>0){
            int digit = code % 10;
            code = code / 10;

            digit = (digit + 5) % 10;
            enc_code = (enc_code + digit)*10;
        }

        enc_code = enc_code / 10;
        return enc_code;
    }

    public static int decryption(int enc_code){
        // 加密和解密的逻辑是一样的
        // enc: (number + 5) % 10;
        // dec: ((number + 5) % 10 + 5) % 10 = (number + 10) % 10;
        return encryption(enc_code);
    }
}
