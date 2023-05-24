package com.example.switchs;

import java.util.Scanner;

public class Switchs1 {
    public static void main(String[] args) {
        // 1、switch基本使用，以给出一个数计算星期为例
        int week = 5;
//        caleWeek(week);
        // 2、case穿透，1-5是工作日，6-7是休息日
        // 当case开始穿透，后续case就不具有匹配效果，内部的语句都会被执行，直到看到break，或者将整个switch语句执行完毕，才会结束
        caleWeekCase();
    }
    private static void caleWeek(int week){
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("您的输入有误！");
                break;
        }

    }
    private static void caleWeekCase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int num = sc.nextInt();
        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("您的输入有误！");
        }
    }
}
