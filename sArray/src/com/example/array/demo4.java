package com.example.array;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        /*
            让用户输入五个数计算和
         */
        // 1、创建键盘录入，准备键盘录入
        Scanner sc = new Scanner(System.in);
        // 2、定义一个求和的变量，准备记录累加后的和值
        int sum = 0;
        //3、动态初始化一个长度为5的int数组，准备存储键盘录入的数值
        int arr[] = new int[5];
        // 快捷生成 数组的for循环   arr.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个整数：");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum:" + sum);
    }
}
