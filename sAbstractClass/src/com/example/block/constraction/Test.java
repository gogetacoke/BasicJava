package com.example.block.constraction;

import javax.crypto.interfaces.PBEKey;

public class Test {
    /*
        构造代码块
            位置：类中方法外定义
            特点：每次构造方法执行时，都会执行该代码块中的代码，并且在构造方法执行前执行
            作用：将多个构造方法中相同的代码，抽取到构造代码块中，提供代码的复用性。
     */
    public static void main(String[] args){
        Student stu1 = new Student();
        Student stu2 = new Student(10);
    }
    /*
        输出结果：
            这是构造代码块
            空参构造方法
            这是构造代码块
            有参构造方法！
     */
}
class Student{
    {
        System.out.println("这是构造代码块");
    }

    public Student(){
        System.out.println("空参构造方法");
    }

    public Student(int a){
        System.out.println("有参构造方法！");
    }
}
