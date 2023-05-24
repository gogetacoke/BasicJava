package com.classroom.testoop3;

// 抽象类
public abstract class Operator {
    private double num1;
    private double num2;
    private String op;
    // 抽象方法
    public abstract double cal();

    public double getNum1() {
        return num1;
    }

    public void setNum1(double nun1) {
        this.num1 = nun1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
