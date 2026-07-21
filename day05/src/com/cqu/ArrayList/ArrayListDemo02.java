package com.cqu.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("huawei", 1000));
        list.add(new Phone("xiaomi", 8000));
        list.add(new Phone("oppo", 2999));

        ArrayList<Phone> list2 = getPhoneList(list);
        //System.out.println(list2);
        for (Phone phone : list2) {
            System.out.println(phone.getBand()+", "+phone.getPrice());
        }
    }


    public static ArrayList<Phone> getPhoneList(ArrayList<Phone> list) {
        // 返回价格低于3000的手机
        ArrayList<Phone> phoneList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000){
                phoneList.add(list.get(i));
            }
        }

        return phoneList;
    }
}
