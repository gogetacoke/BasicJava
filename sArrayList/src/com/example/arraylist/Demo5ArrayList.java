package com.example.arraylist;

import com.example.domain.Student;

import java.util.ArrayList;

public class Demo5ArrayList {
    /*
        需求：定义一个方法，方法接收一个集合对象(泛型为Student)
            方法内部将年龄低于18的学生对象找出来
            并存入新集合对象，方法返回新集合
        思路：
            1、定义方法，方法接收一个泛型为Student类型的集合
            2、方法内部定义新集合，准备存储筛选出的学生对象ArrayList<Student> newList
            3、遍历原集合，获取每一个学生对象
            4、通过学生对象调用getAge方法获取年龄，并判断年龄是否低于18
            5、将年龄低于18的学生对象存入新集合
            6、返回新集合
            7、main方法中测试该方法
     */
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("王五",17);
        Student stu3 = new Student("李二",15);
        Student stu4 = new Student("麻子",19);
        Student stu5 = new Student("王三",28);
        Student stu6 = new Student("文物",11);
        ArrayList<Student> stus = new ArrayList<>();
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        stus.add(stu4);
        stus.add(stu5);
        stus.add(stu6);
        ArrayList<Student> list = getList(stus);
        for (Student student : list) {
            System.out.println(student.getName() + "..." + student.getAge());
        }
    }
    //  1、定义方法，方法接收一个泛型为Student类型的集合
    public static ArrayList<Student> getList(ArrayList<Student> list){
        // 2、方法内部定义新集合，准备存储筛选出的学生对象ArrayList<Student> newList
        ArrayList<Student> newList = new ArrayList<>();
        // 3、遍历原集合，获取每一个学生对象
        for (Student student : list) {
            // 4、通过学生对象调用getAge方法获取年龄，并判断年龄是否低于18
            if (student.getAge() < 18) {
                // 5、将年龄低于18的学生对象存入新集合
                newList.add(student);
            }
        }
        // 6、返回新集合
        return newList;
    }
}
