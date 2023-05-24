package com.classroom.abstracts;

public interface ITeach {
    int time = 40; // 接口中的属性必须赋值

    void teachCourse(String name);
    void exam();

}
