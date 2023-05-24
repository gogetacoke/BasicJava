package com.example.block.mstatic;

public class Test {
    /*
        静态代码块
            位置：类中方法外定义
            特点：需要通过static关键字修饰，随着类的加载而加载，并且只执行一次
            作用：在类加载的时候做一些数据初始化的操作
     */

    public static void main(String[] args){
        Student stu1 = new Student();
        Student stu2 = new Student();
        /*
            执行结果
                这是静态代码块
                空参构造方法
                空参构造方法
         */
    }
}
class Student{
    static {
        System.out.println("这是静态代码块");
    }

    public Student(){
        System.out.println("空参构造方法");
    }

    public Student(int a){
        System.out.println("有参构造方法");
    }
}
