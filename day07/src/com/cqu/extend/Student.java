package com.cqu.extend;

public class Student extends Person{


    private String id;

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("实现了游泳");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}
