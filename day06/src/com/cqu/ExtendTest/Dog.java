package com.cqu.ExtendTest;

public class Dog extends Animal{
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"的狗两只前腿死死的抱住骨头猛吃");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
