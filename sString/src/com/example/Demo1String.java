package com.example;

public class Demo1String {
    public static void main(String[] args) {
        /*
            String常见的几种构造方法
                1、public String() 创建一个空白的字符串对象，不包含任何内容
                2、public String(char[] chr) 根据字符数组的内容，来创建字符串对象
                3、public String(String str) 根据传入的字符串内容，来创建字符串对象
                4、String s = "abc" 直接赋值的方式来创建字符串对象，内容就是abc
         */

        // 1、public String() 创建一个空白的字符串对象，不包含任何内容
        String s1 = new String();
        System.out.println(s1); // 输出：空白内容(想要了解原因，需要学习Object，面向对象-继承)

        // 2、public String(char[] chr) 根据字符数组的内容，来创建字符串对象
        char [] chr = {'a','b','c'};
        String s2 = new String(chr);
        System.out.println(s2); // 输出：abc

        // 3、public String(String str) 根据传入的字符串内容，来创建字符串对象
        String s3 = new String("123");
        System.out.println(s3); // 输出：123
    }
}
