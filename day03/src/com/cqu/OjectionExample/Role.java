package com.cqu.OjectionExample;

public class Role {
    private String name;
    private int blood;


    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }


    public void attack(Role role, int damage){
        int blood = role.getBlood();
        blood -= damage;
        if(blood<=0){
            role.setBlood(0);
            System.out.println(role.getName()+"被击败");
        }else{
            role.setBlood(blood);
            System.out.println(this.getName()+"攻击了"+role.getName()+"，"+role.getName()+"还剩"+blood+"滴血");
        }
    }
}
