package com.cqu.OjectionExample;

import java.util.Random;

public class RoleTest {
    public static void main(String[] args) {
        Random r = new Random();
        Role role1 = new Role("张三",100);
        Role role2 = new Role("李四",100);

        while(true){
            int damage = r.nextInt(10)+1;
            if (role1.getBlood()>0){
                role1.attack(role2, damage);
            }else{
                break;
            }

            if (role2.getBlood() > 0) {
                role2.attack(role1, damage);
            }else{
                break;
            }

        }
        if(role1.getBlood()>0){
            System.out.println(role1.getName()+"胜利");
        }else{
            System.out.println(role2.getName()+"胜利");
        }
    }
}
