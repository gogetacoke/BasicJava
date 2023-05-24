package com.example.randoms;

import java.util.Random;
import java.util.Scanner;

public class Randoms {
    public static void main(String[] args) {
        /*
         * 1、使用Random产生0-10之间1个随机数
         * 2、使用Random产生1-10全部随机数
         * 3、使用random完成一个猜数字案例
         * */

        // 1、使用Random产生0-10之间1个随机数
//        Random r = new Random();
//        int num = r.nextInt(10);
//        System.out.println(num);

        // 2、使用Random产生1-10全部随机数
//        for(int i = 1; i<=10; i++){
//            Random r = new Random();
//            int num = r.nextInt(10) + 1;
//            System.out.println(num);
//        }

        // 3、使用random完成一个猜数字案例
        /*
         * 准备条件
         * 1、需要准备用户录入、随机数的产生
         * 2、用户猜测不同的猜测结果应该对应不同的提示语
         * 3、用户猜测一次就中的几率很少
         * */
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        while (true){
            System.out.println("请输入您要猜的数：");
            int userInput = sc.nextInt();
            if(userInput > randomNum){
                System.out.println("猜大了");
            }else if(userInput < randomNum){
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜您猜对了！");
                break;
            }
        }
    }
}
