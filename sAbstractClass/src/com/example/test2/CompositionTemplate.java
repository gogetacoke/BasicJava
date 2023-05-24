package com.example.test2;

public abstract class CompositionTemplate {
    // 设计模式：设计一个模板，中间不确定的内容需要子类来完成
    public void write(){
        System.out.println("《这个夏天》");
        body();
        System.out.println("啊~ 这就是我的夏天");
    }
    // 中间内容不知道，是什么内容，创造一个抽象方法，使其子类进行重写
    public abstract void body();
}
