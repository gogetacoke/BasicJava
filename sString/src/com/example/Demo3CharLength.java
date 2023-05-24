package com.example;

import java.util.Scanner;

public class Demo3CharLength {
    public static void main(String[] args) {
        /*
            需求：
                1、接收用户输入的字符串
                2、遍历字符串打印在控制台
            使用String的内置方法：charAt（根据索引获取对应的值）、length()
         */

        // 1、接收用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        String str = sc.nextLine();

//        2、遍历字符串打印在控制台
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
