package com.cqu.learning;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
        girlFriend.setName("小花");
        girlFriend.setAge(18);
        girlFriend.setGender("女");
        girlFriend.show();

        BoyFriend boyFriend = new BoyFriend();
        boyFriend.name = "小王";
        boyFriend.age = 18;
        boyFriend.gender = "男";
        boyFriend.show();
    }
}
