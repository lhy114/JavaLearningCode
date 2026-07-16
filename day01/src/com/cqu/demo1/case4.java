package com.cqu.demo1;

public class case4 {
    public static void main(String[] args) {
        /*
        * 逢 7 过游戏
        * 输出1-100的数，逢7过
        * */

        for (int i=1;i<=10000;i++){
            if(i%7==0){
                System.out.println(i+":过");
                continue;
            }

            int temp = i;
            boolean flag = false;
            while(temp>0){
                int temp1 = temp % 10;
                if(temp1==7){
                    flag = true;
                    break;
                }else{
                    temp /= 10;
                }
            }

            if(flag){
                System.out.println(i+":过");
            }
        }
    }
}
