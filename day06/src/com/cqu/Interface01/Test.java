package com.cqu.Interface01;

public class Test {
    public static void main(String[] args) {
        InterImpl inter =  new InterImpl();
        inter.method();

        Inter.speakEnglish();
        //inter.speakEnglish(); 报错
    }
}
