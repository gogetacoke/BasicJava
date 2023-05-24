package com.example.test1;

public class TestABC {
    public static void main(String[] args) {
        test1 test1 = new test1(10);

    }
}

class test{
//    public test(){
//        System.out.println("父类的空参构造方法！");
//    }
    public test(int age){
        System.out.println("这是父类的有参构造！" + age);
    }
    public void method(){
        System.out.println("父类中的方法！");
    }
}

class test1 extends test{

    public test1(int age){
        super(age);
    }
}
