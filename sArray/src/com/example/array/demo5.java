package com.example.array;

public class demo5 {
    public static void main(String[] args) {
        /*
            根据给定的数组求出数组中最大的值
         */
        int arr[] = {52,98,102,36,12};
        // 1、假设数组中第一个值是最大的
        int max = arr[0];
        // 2、遍历获取数组中的值，获取每一个元素，进行比较
        for (int i = 1; i < arr.length; i++){
            // 3、如果比较的过程中，出现了别定义的max还要大，让max更改为最大的值
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // 4、循环结束打印max的值
        System.out.println("max:" + max);
    }
}
