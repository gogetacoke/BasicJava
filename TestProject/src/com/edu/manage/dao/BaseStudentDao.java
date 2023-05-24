package com.edu.manage.dao;

import com.edu.manage.domain.Student;

public abstract class BaseStudentDao {

    // 添加学生逻辑
    public abstract boolean addStudent(Student stu);
    // 返回学生数组
    public abstract Student[] findAllStudent();
    // 删除学生逻辑
    public abstract void deleteStudentById(String delId);
    // 返回对象索引
    public abstract int getIndex(String id);
    // 修改学生逻辑
    public abstract void updateStudent(String updateId, Student updateStu);
}
