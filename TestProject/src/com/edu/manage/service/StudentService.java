package com.edu.manage.service;

import com.edu.manage.dao.OtherStudentDao;
import com.edu.manage.dao.StudentDao;
import com.edu.manage.domain.Student;

public class StudentService {
    // 创建StudentDao
    private static final OtherStudentDao studentDao = new OtherStudentDao();

    public boolean addStudent(Student stu) {
        // 将学生对象传递给StudentDao中的addStudent方法
        // 根据返回的boolean类型结果，返回给StudentController
        return studentDao.addStudent(stu);
    }

    public boolean addTeacher(){
        return true;
    }

    // 判断学生学号是否在数组中存在。
    public boolean isExists(String id) {
        Student[] stus = studentDao.findAllStudent();
        // 假设id在数组中存在
        boolean exists = false;
        // 遍历数组，获取每一个学生对象，准备进行判断
        for (Student student : stus) {
            if (student != null && student.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }
    // 查询学生信息
    public Student[] findAllStudent() {
        // 1、调用库管对象的findAllStudent获取学生对象数组
        Student[] allStudent = studentDao.findAllStudent();
        // 2、判断数组中是否有学生信息（有：返回地址，没有：返回null）
        // 思路：数组中只要存在一个不是null的元素，就代表有学生信息
        boolean flag = false;
        for (Student allStu: allStudent){
            if (allStu != null){
                flag = true;
                break;
            }
        }
        if (flag){
            // 有信息
            return allStudent;
        }else{
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public void updateStudent(String updateId, Student updateStu) {
        studentDao.updateStudent(updateId,updateStu);
    }
}
