package com.cqu.Interface;

public class Dog extends Animal implements Swim{

    @Override
    public void eat() {
        System.out.println("狗正在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗正在游泳");
    }
}
