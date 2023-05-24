package com.classroom.experiment;

import java.util.Scanner;

public class GuessNumMatch {
    public static void main(String[] args) {
        int guessNum;
        int sumMatch = 21;
        System.out.println("现有21根火柴，每次只能从中抽取(1-4)根火柴，您先进行抽取：");
        Scanner sc = new Scanner(System.in);
        while (sumMatch > 1){
            System.out.print("这次您取几根：");
            guessNum = sc.nextInt();
            if (guessNum<1 || guessNum>4){
                System.out.println("取得不对，请您检查后重新取！！");
            }else {
                System.out.printf("机器人抽取：%s",5-guessNum);
                sumMatch -= guessNum;
                System.out.printf("\n还剩余%s根",sumMatch);
            }
        }
        System.out.println("游戏结束！！，您输了");
    }
}
