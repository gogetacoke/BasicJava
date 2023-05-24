package com.example.construction3;

public class Student {
    private String name;
    private int age;

    // 无参构造方法(此构造方法本是系统默认的构造方法，可以省略，若同时使用有参与无参构造方法时需要写出来)
    public Student(){
    }

    // 有参构造方法
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + "-----" + age);
    }
}
