package com.classroom.experiment;

import java.util.Arrays;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.print("请输入参与此次游戏的总人数：");
        Scanner sc = new Scanner(System.in);
        int cNum = sc.nextInt();
        int[] arr = new int[cNum];
        System.out.printf("一共%d人参与游戏", arr.length);
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int endP = cNum;
        int count = 0, x = 1, y = 0;
        while (endP != 1) {
            if (endP == 2) {
                y++;
                if (y == 1) {
                    System.out.print("最终能活下来的编号为：");
                    for (int i = 0; i < cNum; i++) {
                        if (arr[i] != 0) {
                            System.out.printf("%d ", (i + 1));
                        }
                    }
                    System.out.println();
                }
            }
            for (int i = 0; i < cNum; i++) {
                if (arr[i] == 0) {
                    continue;
                }
                count += 1;
                if (count == 3) {
                    count = 0;
                    arr[i] = 0;
                    endP--;
                }
            }
            System.out.printf("第%d轮报数完，剩余：%d人\n", x, endP);
            ++x;
        }
        for (int i = 0; i < cNum; i++) {
            if (arr[i] != 0) {
                System.out.printf("如果游戏进行到底，最终能活下来人的编号为：%d", (i + 1));
            }
        }
    }
}
