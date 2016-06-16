package com.check.test;

import java.util.Map;

/**
 * Created by chen on 2016/6/16.
 */
public class Student {

    private int age;
    private String name;


    private String sex;
    private Map<String, String> grade;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setGrade(Map<String, String> grade) {
        this.grade = grade;
    }

    public Map<String, String> getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Student() {
        super();
    }

    public Student(int age) {
        this.age = age;
    }

    protected Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    private Student(Map<String, String> grade) {
        this.grade = grade;
    }

    public int getResult(){
        return (int)(Math.random()*100 -1);
    }
}
