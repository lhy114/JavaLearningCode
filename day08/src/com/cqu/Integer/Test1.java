package com.cqu.Integer;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(sum<=200){
            int a = sc.nextInt();
            sum += a;
            list.add(a);
        }
    }
}
