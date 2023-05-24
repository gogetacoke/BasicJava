package com.edu.manage.entry;

import com.edu.manage.controller.OtherStudentController;
import com.edu.manage.controller.StudentController;
import com.edu.manage.controller.TeacherController;

import java.util.Scanner;

public class InfoManageEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            // 主菜单的搭建
            System.out.println("------欢迎来到信息管理系统------");
            System.out.println("请输入您的选择：1.学生管理 2.老师管理 3.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    // System.out.println("学生管理");
                    // 开启学生管理系统
                    OtherStudentController studentController = new OtherStudentController();
                    studentController.start();
                    break;
                case "2":
                    // System.out.println("老师管理");
                    // 开启学生管理系统
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("退出成功，感谢您的使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }
}
