package com.example.mehod;

public class Demo1Method {
    /*
        方法的定义格式
            public static void 方法名(){
                    方法体
                }
        方法的调用格式
            eat();
     */
    public static void study(){
        System.out.println("学习");
    }
    public static void eat(){
        study();
        System.out.println("吃饭");
    }

    public static void main(String[] args) {
        // 方法需要在主方法中才能被执行，方法与方法之间也能进行调用。
        eat();
    }
}
