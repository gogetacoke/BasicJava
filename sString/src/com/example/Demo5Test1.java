package com.example;

import java.util.Scanner;

public class Demo5Test1 {
    /*
        需求：
            1、获取用户输入字符
            2、根据用户输入的字符，进行遍历
            3、统计字符中大小写数字字符出现的个数
     */
    public static void main(String[] args) {
        // 1、获取用户输入字符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入： ");
        String s = sc.nextLine();
        // 使用toCharArray方法将字符转为数组
        char[] chars = s.toCharArray();
        // 使用三个变量表示大小写数字，以便计数
        int maxCount = 0;
        int smallCount = 0;
        int numCount = 0;
        // 2、根据用户输入的字符，进行遍历
        // 3、统计字符中大小写数字字符出现的个数
        for (char value: chars){
            if (value>='A' && value<='Z'){
                maxCount++;
            }else if(value>='a' && value<='z'){
                smallCount++;
            }else if(value>='0' && value<='9'){
                numCount++;
            }
        }
        System.out.printf("大写字符出现%d次\n",maxCount);
        System.out.printf("小写字符出现%d次\n",smallCount);
        System.out.printf("数字字符出现%d次\n",numCount);

    }
}
