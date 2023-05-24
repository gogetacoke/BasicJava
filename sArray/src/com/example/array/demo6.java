package com.example.array;

public class demo6 {
    /*
        数组反转
     */
    public static void main(String[] args) {
        int[] arr = {11, 55, 66, 77, 88, 99};
        // 定义两个指针来指定那两个值进行交换
        int start = 0;
        int end = arr.length-1;
        // start<end 当初始值索引小于末尾值的索引，才会进行交换
        for (; start<end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
