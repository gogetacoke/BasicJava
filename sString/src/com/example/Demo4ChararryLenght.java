package com.example;

import java.util.Scanner;

public class Demo4ChararryLenght {
    /*
        使用String类中charArray方法打印遍历字符串
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String str = sc.nextLine();

        char [] c = str.toCharArray();
        // 增强型for循环
        for (char value : c) {
            System.out.println(value);
        }
    }
}
