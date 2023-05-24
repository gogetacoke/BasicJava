package com.example;

import java.util.Scanner;

public class Example2 {
    /*
      录入评委打分，根据打分情况去掉最高分与最低分，算出平均分
    */
    public static void main(String[] args) {
        // 1、创建一个动态数组，假设评委人数为6人
        int arr[] = new int[6];
        //2、录入评委输入
        Scanner sc = new Scanner(System.in);
        //3、根据用户输入的数据判断数据是否是1-100,满足条件的数据存储到数组中
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数");
            int score = sc.nextInt();
            if (score>0 && score<=100){
                arr[i] = score;
            }else {
                System.out.println("您的输入有误，请重新输入!");
                i--;
            }
        }
        // 4、计算最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        //5、计算最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }

        //6、计算总和值
        int sum = 0;
        for (int j : arr) {
            sum+=j;
        }

        //7、计算平均值
        int avg = (sum - max - min) / arr.length;
        System.out.println(avg);
    }
}
