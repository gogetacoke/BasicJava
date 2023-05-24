package com.example.arraylist;

import com.example.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo3ArrayList {
    /*
        需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
                学生的姓名与年龄需要键盘录入
     */

    public static void main(String[] args) {
        // 创建三个学生对象
        Student stu1 = getStuInfo();
        Student stu2 = getStuInfo();
        Student stu3 = getStuInfo();
        // 创建一个存储学生信息的集合
        ArrayList<Student> stus = new ArrayList<>();
        // 使用add()方法添加学生信息
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        //使用for循环遍历打印学生信息
        for (int i = 0; i < stus.size(); i++) {
            // 打印学生对象
            Student s = stus.get(i);
            // 打印学生信息
            System.out.println(s.getName() + "..." + s.getAge());
        }
        /*
            15
            请输入您的姓名：
            Aibiko
            请输入年龄：
            25
            请输入您的姓名：
            meikou
            请输入年龄：
            28
            marry...15
            Aibiko...25
            meikou...28
         */
    }
    // 编写一个键盘录入学生信息的方法
    public static Student getStuInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        // 录入学生姓名  考虑需连续输入使用 next() nextInt()
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        // 返回学生对象
        return new Student(name,age);
    }
}
