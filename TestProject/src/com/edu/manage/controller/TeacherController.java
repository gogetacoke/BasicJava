package com.edu.manage.controller;

import com.edu.manage.dao.TeacherDao;
import com.edu.manage.domain.Teacher;
import com.edu.manage.service.StudentService;
import com.edu.manage.service.TeacherService;

import java.util.Scanner;

public class TeacherController{
    private final TeacherService teacherService = new TeacherService();
    private final Scanner sc = new Scanner(System.in);
    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------欢迎来到<老师>管理系统------");
        System.out.println("请输入您的选择：1、添加老师 2、删除老师 3、修改老师 4、查看老师 5、退出系统");
        mark:while (true){
            String choice = sc.next();
            switch (choice){
                case "1":
//                    System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
//                    System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
//                    System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
//                    System.out.println("查看老师");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("退出老师管理系统成功，感谢您的使用！");
                    break mark;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        }
    }

    private void findAllTeacher() {
    }

    private void updateTeacher() {
    }

    private void deleteTeacherById() {
    }

    private void addTeacher() {
        String id;
        while (true){
            System.out.println("请输入老师id：");
            id = sc.next();
            boolean flag = teacherService.isExists(id);
            if (flag){
                System.out.println("此ID已经存在，请重新输入！");
            }else {
                break;
            }
        }
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        String age = sc.next();
        System.out.println("请输入生日：");
        String birthday = sc.next();

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);

        boolean result = teacherService.addTeacher(teacher);
        if (result){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
    }

}
