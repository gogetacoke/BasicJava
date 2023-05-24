package com.edu.manage.controller;

import com.edu.manage.domain.Student;
import com.edu.manage.service.StudentService;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{
    private final Scanner sc = new Scanner(System.in);
//    private final StudentService studentService = new StudentService();
//
//    public void start() {
//        mark:
//        while (true) {
//            System.out.println("-----欢迎来到<学生>管理系统-----");
//            System.out.println("请输入您的选择：1、添加学生 2、删除学生 3、查看学生 4、修改学生 5、退出系统");
//            String choice = sc.next();
//            switch (choice) {
//                case "1":
//                    // System.out.println("添加学生");
//                    // 添加学生逻辑
//                    addStudent();
//                    break;
//                case "2":
////                    System.out.println("删除学生");
//                    deleteStudentById();
//                    break;
//                case "3":
////                    System.out.println("查看学生");
//                    findAllStudent();
//                    break;
//                case "4":
////                    System.out.println("修改学生");
//                    updateStudent();
//                    break;
//                case "5":
//                    System.out.println("退出学生管理系统成功，感谢您的使用！");
//                    break mark;
//                default:
//                    System.out.println("您的输入有误，请重新输入！");
//                    break;
//            }
//        }
//
//    }
//
//    // 修改学生
//    public void updateStudent() {
//       /* String updateId;
//        while (true) {
//            System.out.println("请输入需要修改的学生id：");
//            updateId = sc.next();
//            boolean exists = studentService.isExists(updateId);
//            if (!exists) {
//                System.out.println("未找到该id，请重新输入!");
//            } else {
//                break;
//            }
//        }*/
//        String updateId = inputStudentId();
//        /*System.out.println("请输入姓名：");
//        String name = sc.next();
//        System.out.println("请输入年龄：");
//        String age = sc.next();
//        System.out.println("请输入生日：");
//        String birthday = sc.next();
//
//        Student updateStu = new Student();
//        updateStu.setId(updateId);
//        updateStu.setName(name);
//        updateStu.setAge(age);
//        updateStu.setBirthday(birthday);*/
//        Student updateStu = inputStudentInfo(updateId);
//        studentService.updateStudent(updateId,updateStu);
//    }
//
//    // 添加学生方法
//    public void addStudent() {
//        // 键盘接受学生信息的输入
//        String id;
//        // 判断学生ID是否存在
//        while (true) {
//            System.out.println("请输入学生ID：");
//            id = sc.next();
//            boolean flag = studentService.isExists(id);
//            if (flag) {
//                System.out.println("学会已被占用，请重新输入！");
//            } else {
//                break;
//            }
//        }
//        /*System.out.println("请输入学生姓名：");
//        String name = sc.next();
//        System.out.println("请输入学生年龄：");
//        String age = sc.next();
//        System.out.println("请输入学生生日：");
//        String birthday = sc.next();
//        // 将学生信息封装成一个学生对象
//        Student stu = new Student();
//        stu.setId(id);
//        stu.setName(name);
//        stu.setAge(age);
//        stu.setBirthday(birthday);*/
//        Student stu = inputStudentInfo(id);
//        // 将学生对象传递给StudentService类中的addStudent方法
//        // 根据返回的boolean类型结果，来判断添加成功/失败
//        boolean result = studentService.addStudent(stu);
//        if (result) {
//            System.out.println("添加成功！");
//        } else {
//            System.out.println("添加失败！");
//        }
//    }
//
//    // 查询学生方法
//    public void findAllStudent() {
//        // 1、调用业务员中的获取方法，得到学生对象数组
//        Student[] stus = studentService.findAllStudent();
//        // 2、判断数组的内存地址，是否为null
//        if (stus == null) {
//            System.out.println("查无信息，请添加后重试");
//            return;
//        }
//        // 3、遍历数组，获取学生信息并打印到控制台
//        System.out.println("学号\t\t\t姓名\t\t年龄\t\t生日");
//        for (Student stu : stus) {
//            if (stu != null) {
//                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
//            }
//        }
//    }
//
//    // 根据学生id删除学生
//    public void deleteStudentById() {
//        //String delId;
//        /*while (true) {
//            // 1、键盘录入要删除的学生id
//            System.out.println("请输入需要删除的学生id：");
//            delId = sc.next();
//            // 2、判断id在容器中是否存在，不存在则需要一直录入
//            boolean exists = studentService.isExists(delId);
//            if (!exists) {
//                System.out.println("未找到该id，请重新输入!");
//            } else {
//                break;
//            }
//        }*/
//        String delId = inputStudentId();
//        // 3、调用业务员的deleteStudentById根据id，删除学生
//        studentService.deleteStudentById(delId);
//        // 4、删除成功提示
//        System.out.println("删除成功！");
//    }
//
//    // 键盘录入学生id
//    public String inputStudentId(){
//        String id;
//        while (true) {
//            // 1、键盘录入要删除的学生id
//            System.out.println("请输入学生id：");
//            id = sc.next();
//            // 2、判断id在容器中是否存在，不存在则需要一直录入
//            boolean exists = studentService.isExists(id);
//            if (!exists) {
//                System.out.println("未找到该id，请重新输入!");
//            } else {
//                break;
//            }
//        }
//        return id;
//    }

    // 键盘录入学生信息
    @Override
    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();
        // 将学生信息封装成一个学生对象
        Student stu = new Student(id,name,age,birthday);
       /* stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);*/
        return stu;
    }
}
