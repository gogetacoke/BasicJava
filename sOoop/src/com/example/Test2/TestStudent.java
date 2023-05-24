package com.example.Test2;

public class TestStudent {
    public static void main(String[] args) {
        // 无参构造方法
        Student stu1 = new Student();
        stu1.setAge(12);
        stu1.setName("张三");
        stu1.show();
        // 有参构造方法
        Student stu2 = new Student("李四",15);
        stu2.show();
    }
}
