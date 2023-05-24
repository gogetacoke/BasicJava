package com.classroom.testoop3;

public class OperatorFactory{
    // double... 传递可变参数
    // ,double... params
    public static Operator createOperator(String op){
        Operator operator = null;
        switch (op){
            case "+":
                operator = new AddOperator();
                break;
            case "/":
                operator = new DivOperator();
                break;
        }
        /*operator.setNum1(params[0]);
        operator.setNum2(params[1]);*/
        return operator;
    }

}
