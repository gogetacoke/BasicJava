package com.example.array;

import java.util.Scanner;

public class demo3 {
    /*
        在静态的数组中，写入5个数，用户控制台随意输入一个存在或不存在的数
        存在将他的索引打印出来，如果不存在，就将他的索引值打印成-1
     */

    public static void main(String[] args) {
        // 1、定义一个静态数组
        int arr[] = {85,95,63,99};
        //2、录入用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请随意输入一个数");
        int num = sc.nextInt();
        //3、索引值为-1，初始化一个索引index让它为-1
        int index = -1;
        //4、循环遍历用户输入的输等于还是不等于数组中的数
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println("索引为：" + index);
    }
}
