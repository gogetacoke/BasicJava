package com.example.Test1;

public class Student {
    private int age;
    private String name;

    /*
        当形参与成员变量名相同时，定义的方法中使用成员变量需要this关键字来进行区分
        this关键字取值范围：就近原则
        this的作用：可以调用本类的成员（变量、方法），解决局部变量和成员变量重名的问题
        this:代表所在类的引用，方法被那个对象调用，this就代表那个对象
     */
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void show(){
        System.out.println(name + "开始展示" + age);
    }
}
