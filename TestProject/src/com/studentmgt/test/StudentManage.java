package com.studentmgt.test;

import com.studentmgt.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        // 2、用Scanner实现键盘录入数据
        Scanner sc = new Scanner(System.in);

        // 定义学生集合容器存储CRUD后的学生信息
        ArrayList<Student> list = new ArrayList<>();
        //  4、用循环完成再次回到主界面

        // 定义一个lo标号，下方switch语句进行break跳出指定循环
        lo:while (true){
            // 1、搭建主菜单
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1、添加学生");
            System.out.println("2、删除学生");
            System.out.println("3、修改学生");
            System.out.println("4、查看学生");
            System.out.println("5、退出");
            System.out.println("请输入您的选择：");
            int num = sc.nextInt();
            // 3、用switch语句完成操作的选择
            switch (num){
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    deleteStudent(list);
                    break;
                case 3:
                    updateStudent(list);
                    break;
                case 4:
                    queryStudent(list);
                    break;
                case 5:
                    System.out.println("欢迎下次光临！");
                    break lo;
                default:
                    System.out.println("请输入您的选择：");
                    break;
            }
        }
    }

    // 定义一个方法，用于查看学生信息
    public static void queryStudent(ArrayList<Student> list) {
        // a、判定集合中是否有数据，如果没有显示提示信息
        // 通过获取集合中的元素个数来判断集合中是否有添加学生
        if (list.size()==0){
            System.out.println("没有学生信息，请添加后重新查询！");
        }else {
            // b、size不等于0证明集合中是有学生的，就显示表头信息
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t生日");
            // c、将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
            for (Student stu : list) {
                // 定义一个学生对象，使用for循环遍历集合中的每一个学生对象
                System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "岁" + "\t" + stu.getBirthday());
            }
        }
    }

    // 定义一个方法，用于更改学生信息
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生学号：");
        // 键盘录入需要修改的学生学号
        String updateSid = sc.next();
        // 根据学号调用stuIndex方法来判断该学号是否存在
        int index = stuIndex(list, updateSid);
        if (index == -1){
            // 不存在
            System.out.println("请输入正确的学生学号！");
        }else {
            // 存在，修改
            System.out.println("请输入新的学生姓名：");
            String name = sc.next();
            System.out.println("请输入新的学生年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日：");
            String birthday = sc.next();
            // 修改后将生成一个新的学生对象，这里需重新建一个学生对象
            Student stu = new Student(updateSid,name,age,birthday);
            list.set(index,stu);
            System.out.println("学生信息修改完成！");

        }
    }

    // 定义一个方法，用于删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的学生学号：");
        // 键盘接收需要删除的学生学号
        String sid = sc.next();
        // 调用stuIndex方法获取该信息是否在集合中存在
        int index = stuIndex(list, sid);
        if (index == -1){
            // 不存在
            System.out.println("未找到该学生信息，请重新输入！");
        }else {
            // 存在
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

    // 定义一个方法，用于添加学生
    public static void addStudent(ArrayList<Student> list) {
        // a、显示提示信息提示输入何种信息
        // b、键盘录入学生对象所需要的数据
        String addSid;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入学号：");
            addSid =sc.next();
            int index = stuIndex(list, addSid);
            if (index == -1){
                break;
            }
            System.out.println("学号存在，请重新输入！");
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生生日，格式(2001-03-17)");
        String birthday = sc.next();
        //  c、创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student stu = new Student(addSid,name,age,birthday);
        // d、给学生对象添加到集合中
        list.add(stu);
        // e、给出添加成功提示
        System.out.println("添加成功！");
    }

    // 判定学号是否存在的的方法
    public static int stuIndex(ArrayList<Student> list, String sid){
        // 设定一个索引为-1表示该生不存在
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            // 通过遍历获取每一个学生对象
            Student stu = list.get(i);
            // 获取每一个学生学号
            String id = stu.getSid();
            // 使用获取到的学号与集合中的集合进行比较
            if (id.equals(sid)){
                // 存在：让index记录正确的索引位置
                index=i;
            }
        }
        // 返回正确的索引
        return index;
    }
}
