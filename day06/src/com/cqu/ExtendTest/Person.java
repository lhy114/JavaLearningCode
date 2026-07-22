package com.cqu.ExtendTest;


public class Person {
    private int age;
    private String name;

    public Person() {}
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void keepPet(Animal a, String something){
        if(a instanceof Dog){
            System.out.println(getAge()+"岁的"+getName()+"养了一只"+a.getColor()+"的"+a.getAge()+"岁狗");
            a.eat(something);
        }else if(a instanceof Cat){
            System.out.println(getAge()+"岁的"+getName()+"养了一只"+a.getColor()+"的"+a.getAge()+"岁猫");
            a.eat(something);
        }
    }
}
