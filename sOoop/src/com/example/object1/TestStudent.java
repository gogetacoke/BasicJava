package com.example.object1;

public class TestStudent {
    public static void main(String[] args) {
        // 创建一个对象  类名 对象名 = new 类名()；
        Student stu = new Student();
        // 给对象中的属性赋值 对象名.属性 = 属性值;
        // 未给对象中属性赋值，其打印输出是一个默认值
        System.out.println(stu.age); // null
        System.out.println(stu.name); //0
        // 给对象属性赋值
        stu.name = "张三";
        stu.age = 15;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //根据创建的对象去使用类中的方法：对象名.方法()；
        stu.study();
    }
}
