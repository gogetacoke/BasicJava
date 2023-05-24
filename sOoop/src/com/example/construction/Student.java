package com.example.construction;

public class Student {
    /*
        构造方法的格式：
            1、方法名需要与类名相同，大小写也要一致
            2、没有返回值类型，void也没有
            3、没有具体返回值，不能由return带回结果数据
        执行时机：
            创建对象时调用，每创建一次对象，就会执行一次构造方法。
            不能手动调用构造方法
     */
    public Student(){
        System.out.println("这是Student类中的构造方法！");
    }
}
