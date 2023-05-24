package com.edu.manage.dao;

import com.edu.manage.domain.Teacher;

public class TeacherDao {
    private static final Teacher[] teachers = new Teacher[5];
    public Teacher[] findAllTeacher() {
        return teachers;
    }

    public boolean addTeacher(Teacher teacher) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }else {
            teachers[index] = teacher;
            return true;
        }

    }
}
