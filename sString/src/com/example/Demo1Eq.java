package com.example;

public class Demo1Eq {
    /*
        基本数据类型进行对比时，是比较的值
        引用数据类型进行比较时，是比较的内存地址
        字符属于引用数据类型，需要进行值对比时，需调用String中的Equals方法
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        // Equals方法 不忽略大小写进行比较
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true

        // EqualsIgnoreCase方法者是忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2)); //true
    }
}
