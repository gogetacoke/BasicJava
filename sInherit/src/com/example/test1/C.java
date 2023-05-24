package com.example.test1;

public class C extends B{
    String id = "这是C类成员中的id";
    public void method(){
        String id = "这是C类局部中的id";
        System.out.println("打印C类方法中的局部变量：" + id);
        System.out.println("打印C类方法中的成员变量：" + this.id);
        System.out.println("打印C类父类的成员变量：" + super.id);
        System.out.print("打印C类调用父类中的方法: ");
        super.method();
        System.out.println("这是C类中的方法。。");
    }
}
