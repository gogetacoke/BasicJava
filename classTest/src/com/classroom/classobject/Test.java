package com.classroom.classobject;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 无构造方法的创建对象
        Student y = new Student();
        y.name = "仪远航";
        y.id = "22010230911";
        y.age = 20;
        // 有构造法的创建对象
        Student wang = new Student("22010230922","王三",18);
        System.out.println(y.toString());
        System.out.println(wang);
        // equals 对比两个对象是否相同
        System.out.println(wang.equals(y));
        System.out.println((11+3*8)/4%3);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(1);
            case 3:
                System.out.println(1);
            case 4:
                System.out.println(1);
        }
    }
}
