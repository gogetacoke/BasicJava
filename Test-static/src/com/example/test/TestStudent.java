package com.example.test;

public class TestStudent {
    /*
        1、被static修饰的成员，会被该类的所有对象所共享
        2、被static修饰的成员，会随着类的加载而加载，优先于对象存在
        3、多了一种调用方式，可以通过类名.进行调用
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 15;
//        stu1.school = "东软学院";
        Student.school = "东软学院";
        stu1.school = "china";
        stu1.show();

        Student stu2 = new Student();
        stu2.show();
    }
}
