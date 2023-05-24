package com.example.array;

import com.example.domain.Student;

public class TestObjectArray {
   /*
        需求：将（张三，23） （李四，24） （王五，25）
        封装为3个学生对象并存入数组
        随后遍历数组，将学生信息打印在控制台

        思路：
            1、定义学生类
            2、动态初始化长度为3的数组，类型为Student
            3、根据需求创建3个学生对象
            4、将学生对象存入数组
            5、遍历数组，取出每一个学生对象
            6、调用对象的getXxx方法获取学生信息，并输出在控制台
    */
   public static void main(String[] args) {
       // 2、定义动态数组
       Student [] stuArr = new Student[3];
       // 3、创建3个学生对象
       Student stu1 = new Student("张三",23);
       Student stu2 = new Student("李四",24);
       Student stu3 = new Student("王五",25);
       // 4、将学生对象存入数组
       stuArr[0] = stu1;
       stuArr[1] = stu2;
       stuArr[2] = stu3;
       // 5、遍历数组
       for (Student stu: stuArr) {
           // 遍历出来的是学生对象
//           Student stus = stuArr[i];
           // 6、调用对象的getXxx方法打印学习信息
           System.out.println(stu.getName() + "..." + stu.getName());
       }
   }
}
