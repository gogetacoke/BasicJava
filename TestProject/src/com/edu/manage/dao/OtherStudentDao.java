package com.edu.manage.dao;

import com.edu.manage.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao extends BaseStudentDao {
    // 使用集合进行存储
    private static final ArrayList<Student> stus = new ArrayList<>();
    // 使用静态代码块，初始一些学生数据
    static {
        Student stu1 = new Student("22010230935","远航","18","2004-11-11");
        Student stu2 = new Student("22010230936","张航","15","2007-11-11");
        Student stu3 = new Student("22010230938","刘婵","20","2002-11-11");
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
    }
    // 添加学生逻辑
    public boolean addStudent(Student stu) {
      stus.add(stu);
      return true;
    }
    // 返回学生数组
    public Student[] findAllStudent() {
        Student[] student = new Student[stus.size()];
        for (int i = 0; i < stus.size(); i++) {
            student[i] = stus.get(i);
        }
        return student;
    }
    // 删除学生逻辑
    public void deleteStudentById(String delId) {
        // 1、查找id在容器中所在的索引位置
        int index = getIndex(delId);
        // 2、该索引位置，使用null元素覆盖
        stus.remove(index);
    }
    // 返回对象索引
    public int getIndex(String id){
        int index = -1;
        for (int i=0;i<stus.size();i++) {
            Student stu = stus.get(i);
            if (stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }
    // 修改学生逻辑
    public void updateStudent(String updateId, Student updateStu) {
        // 获取被修改id索引位置
        int index = getIndex(updateId);
        // 替换该索引的内容
        stus.set(index,updateStu);
    }
}
