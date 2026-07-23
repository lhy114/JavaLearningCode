package com.cqu.ExtendTest;

public class Cat extends Animal{

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"的猫正在吃鱼");
    }

    public void getMouse(){
        System.out.println("猫捉老鼠");
    }

}
