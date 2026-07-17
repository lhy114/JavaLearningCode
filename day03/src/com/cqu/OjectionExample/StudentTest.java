package com.cqu.OjectionExample;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("请输入第"+(i+1)+"个学生id:");
            int id = sc.nextInt();
            while(!isExist(students, id, i)){
                System.out.println("id重复请重新输入id: ");
                id = sc.nextInt();
            }
            students[i].setId( id);

            System.out.println("请输入第"+(i+1)+"个学生姓名:");
            String name = sc.next();
            students[i].setName(name);

            System.out.println("请输入第"+(i+1)+"个学生年龄:");
            int age = sc.nextInt();
            students[i].setAge(age);
        }

        printStudents(students);
    }

    public static boolean isExist(Student[] students, int id, int index){
        for (int i = 0; i < index; i++) {
            if (students[i].getId()==id)
                return false;
        }
        return true;
    }

    public static void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getId()+" "+students[i].getName()+" "+students[i].getAge());
        }
    }


    public static void deleteById(Student[] students, int id){
        //1. 查找
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId()==id){
                index = i;
                break;
            }
        }

        if (index==-1){
            System.out.printf("没有这个学生数据删除失败");
        }else{
            students[index] = null;
            System.out.printf("删除成功");
        }
    }
}
