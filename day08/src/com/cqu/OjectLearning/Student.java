package com.cqu.OjectLearning;

import java.util.Arrays;
import java.util.Objects;

public class Student implements Cloneable {
    private int id;
    private String name;
    private int[] scores;

    public Student(){}

    public Student(int id, String name, int[] scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.deepEquals(scores, student.scores);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 深克隆的方式，创建一个新的数组然后进行赋值就行了
        int[] newScores = new int[this.scores.length];
        for (int i = 0; i < this.scores.length; i++) {
            newScores[i] = this.scores[i];
        }
        Student clone = (Student) super.clone();
        clone.scores = newScores;
        return clone;
    }
}
