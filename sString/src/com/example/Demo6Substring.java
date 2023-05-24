package com.example;

import java.util.Scanner;

public class Demo6Substring {
    /*
        需求：
            1、获取用户输入的手机号
            2、将手机号从第三位开始到第七位前结束中间用*号代替  181****4502
     */
    public static void main(String[] args) {
//        1、获取用户输入的手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phoneNum = sc.nextLine();
//        2、将手机号从第三位开始到第七位前结束中间用*号代替  181****4502
        // 截取前三位
        String startNum = phoneNum.substring(0, 3);
        // 截取后四位
        String endNum = phoneNum.substring(7);
        System.out.println(endNum);
        // 字符串拼接
        System.out.println(startNum + "****" + endNum);

    }
}
