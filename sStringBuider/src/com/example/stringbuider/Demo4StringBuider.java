package com.example.stringbuider;

public class Demo4StringBuider {
    /*
        StringBuider与String之间如何进行转换
        1、sb转s
        2、s转sb
     */
    public static void main(String[] args) {
        // 1、stringBudier直接调用tostring方法
        StringBuilder sb = new StringBuilder("abc");
        String str = sb.toString();

        // 2、使用stringBuider的有参构造方法
        String str2 = "您好！";
        StringBuilder sb2 = new StringBuilder(str2);
        System.out.println(sb2);
    }
}
