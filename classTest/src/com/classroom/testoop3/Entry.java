package com.classroom.testoop3;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        System.out.println("请输入第一个运算数：");
        Scanner sc = new Scanner(System.in);
        double num1 =sc.nextDouble();
        System.out.println("请输入第二个运算数：");
        double num2 = sc.nextDouble();
        System.out.println("请输入运算符：");
        String op = sc.next();
        double result = 0.0;
        // 使用工厂类.方法
        Operator operator = OperatorFactory.createOperator(op);
        operator.setNum1(num1);
        operator.setNum2(num2);
        result = operator.cal();
        System.out.printf("%.2f %s %.2f = %.2f",num1,op,num2,result);
    }
}
