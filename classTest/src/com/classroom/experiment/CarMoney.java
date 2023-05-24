package com.classroom.experiment;

import java.util.Scanner;

public class CarMoney {
    public static void main(String[] args) {
        System.out.println("出租车号码牌：1、夏利 2、富康 3、桑塔纳");
        System.out.print("请输入号码：");
        try {
            Scanner sc = new Scanner(System.in);
            // 获取用户选择的车号
            int num = sc.nextInt();
            System.out.print("请输入公里数(km)：");
            // 获取用户的公里数
            double kil = sc.nextFloat();
            // 定义价格、超时费、总车费、起步里程、车名的变量
            int price=0;
            double beyond=0.0;
            double carCost = 0.0;
            int startKil = 3;
            String carName = "";
            // 根据不同车号计算车费
            switch (num){
                case 1:
                    carName = "夏利";
                    price = 7;
                    beyond = 2.1;
                    break;
                case 2:
                    carName = "富康";
                    price = 8;
                    beyond = 2.4;
                    break;
                case 3:
                    carName = "桑塔纳";
                    price = 10;
                    beyond = 2;
                    break;
            }
            if(kil <= startKil){
                System.out.printf("您当前选择的车名为：%s,您行驶了：%s km,应缴纳车费：%s 元", carName, kil, price);
            }else {
                carCost = price + (kil - startKil)*beyond;
                System.out.printf("您当前选择的车名为：%s,您行驶了：%s km,应缴纳车费：%s 元", carName, kil, carCost);
            }
        }catch (Exception f){
            System.out.println("您的输入有误！程序结束后查正重新输入！！！");
        }

    }
}
