package com.classroom.testoop3;

public class DivOperator extends Operator{

    @Override
    public double cal() {
        if (getNum2() == 0){
            System.out.println("除数不能为0！");
        }
        return getNum1()/getNum2();
    }
}
