package com.cqu.Interface;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Frog is eating 虫子");
    }

    @Override
    public void swim() {
        System.out.println("Frog 正在游泳");
    }
}
