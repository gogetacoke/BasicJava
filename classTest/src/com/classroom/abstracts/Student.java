package com.classroom.abstracts;

public class Student implements ITackeClass {

    @Override
    public void takeCourse(String room, CSTeacher t) {
        System.out.println("我要去" + room + "教室" + "上" + t.name + "的课！");
    }
}
