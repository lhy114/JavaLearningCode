package com.cqu.OjectLearning;

public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        int[] scores = new int[]{1,2,3};
        Student student1 = new Student(1,"liuhongyu", scores);
        Student student2 = new Student(1,"liuhongyu", scores);

        // 第一个重写toString
        System.out.println(student1); // 默认返回的是地址值，你只需要重写一下equals就行了
        System.out.println(student2);
        System.out.println(student2.equals(student1));

        // clone
        Student student3 = (Student)student1.clone();
        student1.getScores()[0] = 3;
        System.out.println(student1);
        System.out.println(student3);
    }
}
