package com.example.sortAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    /*
        冒泡排序
        简述：冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，
             如果它们的顺序错误就把它们交换过来。走访数列的工作是重复地进行直到没有再需要交换，
             也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
        算法描述：
            1、比较相邻元素。若果第一个元素打于第二个元素，就进行交换，或者不变
            2、对每一对相邻的元素做同样的工作，从开始的第一对直到最后一对，这样最后一个元素才是最大的
            3、针对所有的元素重复以上的步骤，除了最后一个，直到排序完成
     */
    public static int[] bubbleSort(int [] arr){
        if (arr.length ==0)
            return arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 -j; j++) {
                if (arr[j + 1] < arr[j]){
                    int temp = arr[j + 1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {1,5,6,8,3,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
