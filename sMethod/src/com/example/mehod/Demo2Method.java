package com.example.mehod;

import java.util.Scanner;

public class Demo2Method {
    /*
    带参数方法使用
        根据用户输入的值判断是奇数还是偶数
     */

    public static void isEvalNum(int num){
        if (num %2 ==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isEvalNum(num);
    }
}
