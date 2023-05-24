package com.example.stringbuider;

import java.lang.reflect.Array;

public class Test {
    /*
        将数组arr1={1,2,3}转换为arr1=[1,2,3]
        实现思路：
            1、定义一个字符转换方法
            2、传入字符串，并打印在控制台
     */

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(toStringBuider(arr));
    }

    public static String toStringBuider(int [] arr){
        // 使用stringBuider的有参构造，在字符串拼接初始加上一个[
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {
            // 如果循环到最后一个，就加上]
            if (i == arr.length-1){
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
