package com.example;

import java.util.Scanner;

public class Demo2EqTest {
    /*
        需求：
            1、创建两个变量，一个为账号，一个为密码
            2、系统录入用户输入，账号、密码
            3、判断用户输入的与我创建的是否一致，只允许输入三次，三次到了就停止输入
     */
    public static void main(String[] args) {
        // 1、创建两个变量，一个为账号，一个为密码
        String userName = "admin";
        String passWord = "123456";


        //  3、判断用户输入的与我创建的是否一致，只允许输入三次，三次到了就停止输入
        for (int i = 0; i < 3; i++) {
            // 2、系统录入用户输入，账号、密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账号：");
            String scUserName = sc.nextLine();
            System.out.println("请输入密码：");
            String scPassWord = sc.nextLine();
            if (userName.equals(scUserName) && passWord.equals(scPassWord)){
                System.out.println("恭喜您登陆成功！");
                break;
            }else {
                if (i == 3){
                    System.out.println("账号或密码输入错误，请重新输入");
                }else {
                    System.out.println("密码输入错误，您还剩余"+ (3-i) +"次机会");
                }
            }
        }
    }
}
