package com.cqu.OjectionExample;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        Goods g1 = new Goods(1, "电脑", 5000, 10);
        Goods g2 = new Goods(2, "鼠标", 50, 100);
        Goods g3 = new Goods(3, "键盘", 100, 1000);

        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId()+" "+goods[i].getName()+" "+goods[i].getPrice()+" "+goods[i].getStock());
        }
    }
}
