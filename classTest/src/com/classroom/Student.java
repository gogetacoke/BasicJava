package com.classroom;

public class Student extends Person {
    String dragee;

    public Student() {
    }

    public Student(String name, String age, String dragee) {
        super(name, age);
        this.dragee = dragee;
    }

    public void show() {
        super.show();
        System.out.println("学生：" + name + "年龄：" + age + "学位：" + dragee);
    }
}
