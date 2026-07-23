package com.cqu.extend;

public class Test {
    public static void main(String[] args) {
        Person p = new Student("liu", 10);
        System.out.println(p.getName());
        System.out.println(p.getAge());

        com.cqu.extend.Student s1 = (Student) p;
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getId());
    }
}
