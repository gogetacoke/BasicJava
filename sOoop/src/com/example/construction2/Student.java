package com.example.construction2;


public class Student {
    /*
        有参构造方法的使用
     */
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + "---" + age);
    }
}
