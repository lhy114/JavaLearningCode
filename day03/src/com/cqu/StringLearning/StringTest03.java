package com.cqu.StringLearning;

public class StringTest03 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a"+"b"+"c";
        String s3 = "a";
        String s4 = s3+"b"+"c";
        System.out.println(s1==s2);
        System.out.println(s1==s4);
    }
}
