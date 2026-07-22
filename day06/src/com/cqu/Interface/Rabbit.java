package com.cqu.Interface;

public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Rabbit is eating 胡罗卜");
    }
}
