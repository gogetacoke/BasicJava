package com.example.mehod;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

public class Demo6Method {
    /*
        定义一个方法给定一个数组，找出里面的最大值与最小值
        注意：return只能返回一个结果
     */
    public static int[] getMaxAndMin(int[] arr){
        // 设定数组第一个为最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // 当数组中的值大于我设定的值时，更新max
            if (max<arr[i]){
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        // return只能返回一个结果，如果要返回最大最小值时，我们可以定义一个数组，将整个数组进行返回
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int[] maxAndMin = getMaxAndMin(arr);
        System.out.println(maxAndMin[0]);
        System.out.println(maxAndMin[1]);
    }
}
