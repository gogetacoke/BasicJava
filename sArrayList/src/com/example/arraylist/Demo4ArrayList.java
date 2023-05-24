package com.example.arraylist;

import java.util.ArrayList;

public class Demo4ArrayList {
    /*
        需求：集合中删除test元素
        思路：将集合进行遍历，拿到集合对象进行if语句判断，是test就删除，不是就不管
     */
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("test");
        arr.add("123");
        arr.add("test");
        arr.add("abc");
        arr.add("test");
        arr.add("test");


        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);
            // 如果是变量与常量进行比较时，尽量拿常量的equals()方法来进行比较，以免出现空指针异常
            if ("test".equals(s)){
                arr.remove(i);
                // 避免重复的“test”未被删除
                i--;
            }
        }
        System.out.println(arr);
    }
}
