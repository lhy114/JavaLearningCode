package com.cqu.ExtendTest;

public class Test {
    public static void main(String[] args) {
        Person laoWang = new Person();
        laoWang.setAge(30);
        laoWang.setName("老王");

        Person laoLi = new Person();
        laoLi.setAge(25);
        laoLi.setName("老李");

        Animal a1 = new Cat();
        a1.setAge(3);
        a1.setColor("灰色");

        Animal a2 = new Dog();
        a2.setAge(2);
        a2.setColor("黑色");

        laoWang.keepPet(a2, "骨头");
        laoLi.keepPet(a1, "鱼");
    }
}
