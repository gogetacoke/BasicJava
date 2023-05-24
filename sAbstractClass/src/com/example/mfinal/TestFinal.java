package com.example.mfinal;

public class TestFinal {
    public static void main(String[] args) {
        // final修饰变量量
        final String A = "10";
        // 不能对修饰的变量进行二次赋值
//        A=20;

        // 引用数据类型举例
        final Test test = new Test();
        test.setName("Test");
        test.setName("Test_");
        // 不能开辟一块新的空间
//        test = new Test();
    }
}

class Test{
    private String name;

    public Test(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



// final 修饰类
/*
final class Fu{}

class Zi extends Fu{}*/
