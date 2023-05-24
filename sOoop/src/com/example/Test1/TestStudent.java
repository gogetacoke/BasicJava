package com.example.Test1;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(15);
        stu.setName("张三");
        stu.show();

        /*
            未加this关键字的输出结果：null开始展示0
         */
    }
}
