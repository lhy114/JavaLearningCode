package com.cqu.inner;

public class Test {
    public static void main(String[] args) {

        test1(new Person() {

            @Override
            public void say() {
                System.out.println("使用匿名内部类person实现的");
            }
        });


        test2(new Swim() {
            @Override
            public void swim() {
                System.out.println("使用匿名内部类Swim实现的");
            }
        });
    }


    public static void test1(Person p){
        System.out.println("请使用匿名内部类加多态使用person");
        p.say();
    }

    public static void test2(Swim s){
        System.out.println("请使用匿名内部类加多态使用Swim");
        s.swim();
    }
}
