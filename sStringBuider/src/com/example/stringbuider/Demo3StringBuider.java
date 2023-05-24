package com.example.stringbuider;

public class Demo3StringBuider {
    /*
        StringBuider的常用成员方法
        1、public StringBuilder append(任意类型数据) 添加数据，返回对象本身
        2、public StringBuilder reverse() 返回反转后的字符序列
        3、public String toString() 通过toString()就可以实现StringBuider转换为String类型
        4、public int length() 返回字符长度
     */
    public static void main(String[] args) {
        // 1、append方法
        StringBuilder sb = new StringBuilder();

        // 正常当个数据添加
       /* sb.append(123);
        sb.append("abc");
        sb.append(true);
        System.out.println(sb);*/   // 123abctrue

        // 链式编程，如果一个方法返回的是对象类型，对象就可以继续向下调用
        sb.append("red").append("blue").append("pink");
        System.out.println(sb); //redbluepink


        // 2、revers()
        /*sb.reverse();
        System.out.println(sb); */ //knipeulbder

        // 3、toString
        String sb2 = sb.toString();
        System.out.println(sb2);  // redbluepink 内容与上面一样，但返回的类型不一样，一个是string一个是stringBuider

        // 4、length
        int sb3 = sb.length();
        System.out.println(sb3);// 11

    }
}
