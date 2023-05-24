package com.example;

import java.util.Scanner;

public class Demo8Split {
    /*
        需求：
            1、获取用户输入学生信息
            2、将学生信息根据输入的逗号进行分割
            3、创建一个Student学生类
            4、通过已切割的字符串数组中取出元素，通过Student类的有参构造方法封装为对象
            5、调用对象的getXxx方法，取出数据并打印
     */
    public static void main(String[] args) {
        //  1、获取用户输入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息：");
        String uInfo = sc.nextLine();
        // 2、将学生信息根据输入的逗号进行分割
        String[] arr = uInfo.split("，");
//        4、通过已切割的字符串数组中取出元素，通过Student类的有参构造方法封装为对象
        Student stu = new Student(arr[0],arr[1]);
        // 5、调用对象的getXxx方法，取出数据并打印
        System.out.println(stu.getName() + "-----------" + stu.getAge());

        Student s = new Student();
    }
}
