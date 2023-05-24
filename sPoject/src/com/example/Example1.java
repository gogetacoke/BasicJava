package com.example;

import java.util.Scanner;

public class Example1 {
    /*
     * 根据用户输入来输出用户今天吃什么，用户不结束，且需要一直输入
     * 问题分析：
     *   1、我们明确用户输入某个值该返回什么内容；使用switch……case语句
     *   2、不明确循环的次数；使用while循环
     *   3、根据用户输入的内容来判断；if……else、break
     *
     * */
    public static void main(String[] args) {
        // 用户录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入星期数：");
        int week = sc.nextInt();
        switch (week){
            case 0:
                System.out.println("期待您的下次光临！");
                break;
            case 1:
                System.out.println("今天吃香蕉！");
            case 2:
                System.out.println();

        }
    }
}
