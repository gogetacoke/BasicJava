package com.example.stringbuider;

public class Demo2StringBuider {
    /*
        StringBuider的两种构造方法
        1、无参构造
            StringBuider() 创建一个空白可变字符串对象，不含任何内容
        2、有参构造
            StringBuider(String str) 根据字符串的内容，来创建可变的字符串对象
     */

    public static void main(String[] args) {
        // 无参
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        // 有参
        StringBuilder sb2 = new StringBuilder("您好！");
        System.out.println(sb2);
    }
}
