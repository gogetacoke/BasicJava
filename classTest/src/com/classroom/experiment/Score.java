package com.classroom.experiment;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        // TODO 根据用户输入的成绩给定级别

        //成绩>=90 A,60>=成绩<90 B,60< C

        // 1、获取用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的成绩： ");
        int souce = scanner.nextInt();
        if (souce >= 90) {
            System.out.printf("您的成绩为：%d,等级为：A", souce);
        } else if (souce >= 60) {
            System.out.printf("您的成绩为：%d,等级为B", souce);
        } else {
            System.out.printf("您的成绩为：%d，等级为C",souce);
        }
        System.out.println();
    }

}
