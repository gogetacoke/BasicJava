package com.example.Test2;

public class Student {
    /*
        任务：
            1、创建有参与无参构造方法
            2、每个构造方法都能进行赋值，输出打印
            3、每个构造方法都能调用show()方法
        JavaBean类：封装数据
            使用快捷键快速生成
            右键选择空白处
            1、无参构造方法：“Generate”-->"Construction"--->“选择最上面哪一个我这里是：com.example.Test2.Student点击OK”
            2、有参构造方法：步骤一样，第三步选择"Ctrl+A点击OK"
            3、setXxx/getXxx：第二步选择Getter and Setter
     */

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println(name + "----" + age);
    }
}
