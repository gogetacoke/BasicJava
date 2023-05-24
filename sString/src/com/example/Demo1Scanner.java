package com.example;

import java.util.Scanner;

public class Demo1Scanner {
    /*
        需求：
            同时让用户在控制台输入整数和字符串
        next与nextLine区别：
            next在接收到空格、Tab键时结束用户录入
            nextLine在接收到回车与换行时结束录入
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int i = sc.nextInt();
        System.out.println("请输入字符串: ");
//        String s = sc.nextLine();
        String next = sc.next();
        System.out.println(i);
        System.out.println(next);
    }
}
