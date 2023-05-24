package com.classroom;

public class Person{
    String name;
    String age;


    public Person(){
        System.out.println("我是父类的无参构造方法");
    }



    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("学生：" + name + " " + "年龄：" + age);
    }
}