package com.cqu.OjectLearning;

public class StringEqual {
    public static void main(String[] args) {
        String str1 = "abc";
        StringBuilder sb =  new StringBuilder("abc");

        System.out.println(str1.equals(sb));
        //String的equal函数，首先会比较两个对象的类型是否相同，如果不相同则直接返回false

        System.out.println(sb.equals(str1));
        // StringBuilder继承的是Object的equal函数，那么比较的仍然是地址值
    }
}
