package com.example.array;

public class demo7 {
    /*
        二位数组遍历
        思路：
            1、先遍历二维数组取出一个个的一维数组
            2、遍历取出的一维数组，取出每一个元素
     */
    public static void main(String[] args) {
        int[][] arr = {{11,22,33},{44,55,66}};
        for (int i = 0; i < arr.length; i++) {
            // 首次遍历去除每一个一维数组
            for (int j = 0; j < arr[i].length; j++) {
                // 通过[i][j]索引来循环取出每一个一维数组中的每一个元素
                System.out.println(arr[i][j]);
            }
        }
    }
}
