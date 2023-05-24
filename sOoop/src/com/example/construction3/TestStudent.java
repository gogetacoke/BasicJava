package com.example.construction3;

public class TestStudent {
    public static void main(String[] args) {
        // 无参构造方法使用（因设置的成员变量为私有属性，未创建set、get方法，所以这里就不进行调用）
        Student stu = new Student();
        stu.show();
        //有参构造方法使用
        Student stu1 = new Student("张三",12);
        stu1.show();
    }
}
