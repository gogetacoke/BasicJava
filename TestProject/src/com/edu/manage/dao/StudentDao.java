package com.edu.manage.dao;

import com.edu.manage.domain.Student;

public class StudentDao extends BaseStudentDao {
    // 1、创建学生对象数组
    private static final Student[] stus = new Student[5];
    // 使用静态代码块，初始一些学生数据
    static {
        Student stu1 = new Student("22010230935","远航","18","2004-11-11");
        Student stu2 = new Student("22010230936","张航","15","2007-11-11");
        Student stu3 = new Student("22010230938","刘婵","20","2002-11-11");

        stus[0] = stu1;
        stus[1] = stu2;
        stus[2] = stu3;
    }
    // 添加学生逻辑
    public boolean addStudent(Student stu) {
        // 2、添加学生到数据
        // 2.1 定义变量index为-1，假设数据已经全部存满，没有null的元素
        int index = -1;
        // 2.2 遍历数组中的每一个元素，判断是否为null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null){
                index = i;
                // 2.3 如果为null，让index变量记录当前索引位置，并使用break结束遍历
                break;
            }
        }
        // 3. 返回是否添加成功的boolean类型状态
        if (index == -1){
            // 已经装满了 index == -1
            return false;
        }else {
            // 没有装满，正常添加，返回true index != -1
            stus[index] = stu;
            return true;
        }
    }
    // 返回学生数组
    public Student[] findAllStudent() {
        return stus;
    }
    // 删除学生逻辑
    public void deleteStudentById(String delId) {
        // 1、查找id在容器中所在的索引位置
        int index = getIndex(delId);
        // 2、该索引位置，使用null元素覆盖
        stus[index] = null;
    }
    // 返回对象索引
    public int getIndex(String id){
        int index = -1;
        for (int i=0;i<stus.length;i++) {
            Student stu = stus[i];
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
        stus[index] = updateStu;
    }
}
