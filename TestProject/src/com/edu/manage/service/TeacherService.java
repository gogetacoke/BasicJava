package com.edu.manage.service;

import com.edu.manage.dao.TeacherDao;
import com.edu.manage.domain.Teacher;

public class TeacherService {
    private static final TeacherDao teacherDao = new TeacherDao();
    // 判断ID是否存在
    public boolean isExists(String id) {
        Teacher[] teachers = teacherDao.findAllTeacher();
        // 假设id存在
        boolean exists = false;
        // 遍历数组获取每一个学生对象，进行对比判断
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;
    }

    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }
}
