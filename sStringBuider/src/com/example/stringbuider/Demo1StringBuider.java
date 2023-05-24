package com.example.stringbuider;

import java.util.SortedMap;

public class Demo1StringBuider {
    /*
        测试普通字符串拼接与stringbuider拼接时间对比
     */
    public static void main(String[] args) {
        // 7
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<=50000; i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void method(){
        // 共耗时：4254
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i<=50000; i++){
            str+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
