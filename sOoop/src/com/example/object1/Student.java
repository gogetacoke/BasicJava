package com.example.object1;

public class Student {
    /*
        创建一个学生类
        属性（成员变量）：姓名、年龄
        行为（成员方法）：学习
     */
    String name;
    int age;

    // 在类中写方法，不需要写static
    public void study(){
        System.out.println("正在学习");
    }
}
