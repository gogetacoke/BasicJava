package com.example.arraylist;

import com.example.domain.Student;

import java.util.ArrayList;

public class Demo2ArrayList {
    /*
        一、集合遍历1:
            集合遍历与数组遍历对比
                数组：for (int i=0;i<arr.length;i++){arr[i]}
                集合: for (int i=0;i<arr.size();i++){arr.get(i)}
        二、集合遍历2：
            1、创建一个存储学生对象的集合，存储3个学生对象
     */

    public static void main(String[] args) {
        Student stu1 = new Student("张三",25);
        Student stu2 = new Student("李四",25);
        Student stu3 = new Student("王五",25);
        // 创建一个泛型为Student类型的集合
        ArrayList<Student> stus = new ArrayList<>();
        // 将创建的学生对象，调用集合的add()方法存入集合中
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        // 使用for循环遍历集合
        for (int i = 0; i < stus.size(); i++) {
            // 遍历得到每一个学生对象
            Student s = stus.get(i);
            // 调用学生对象的getXxx方法打印学生信息
            System.out.println(s.getName() + "..." + s.getAge());
        }
    }

    private static void arrayFor1() {
        // 创建一个集合对象
        ArrayList<String> stu = new ArrayList<>();
        // 调用集合对象的add方法添加数据
        stu.add("123");
        stu.add("456");
        stu.add("789");
        for (String s: stu) {
//            String s = stu.get(i);
            System.out.println(s);
            /*输出结果
             * 123
             * 456
             * 789
             */
        }
    }
}
