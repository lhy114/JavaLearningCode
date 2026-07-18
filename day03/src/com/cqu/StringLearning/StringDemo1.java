package com.cqu.StringLearning;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1);

        char[] chs = {'h', 'e', 'l', 'l', 'o'};
        String s2 = new String(chs);
        System.out.println(s2);

        byte[] bytes = {104, 101, 108, 108, 111}; // 网络编程传输的过程中用的是字节数组
        String s3 = new String(bytes);
        System.out.println(s3);

//        Scanner sc = new Scanner(System.in);
//        String s4 = sc.next();

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i)); // 注意这里与c++不同，c里面的string是可以通过索引直接访问的吧
        }
    }
}
