package com.example.mehod;

public class Demo3Method {
    /*
        根据用户输入n，m之间，判断中间如果是奇数就输出
     */
    public static void print(int n,int m){
        System.out.println(n + "到" + m + "之间的奇数为：");
        for (int i = n; i < m; i++) {
            if (i %2 == 1){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        print(10,20);
    }
}
