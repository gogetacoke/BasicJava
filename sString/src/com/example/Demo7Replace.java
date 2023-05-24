package com.example;

import java.util.Scanner;

public class Demo7Replace {
    /*
        需求：
            1、接受用户输入一串字符串
            2、进行敏感词汇替换，将‘TMD’替换成‘***’
            3、输出到控制台
     */
    public static void main(String[] args) {
        //      1、接受用户输入一串字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入： ");
        String s = sc.nextLine();
        //      2、进行敏感词汇替换，将‘TMD’替换成‘***’
        String result = s.replace("TMD", "***");
        System.out.println(result);

    }
}
