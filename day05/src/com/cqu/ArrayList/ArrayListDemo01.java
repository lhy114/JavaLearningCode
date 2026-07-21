package com.cqu.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
