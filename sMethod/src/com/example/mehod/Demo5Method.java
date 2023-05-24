package com.example.mehod;

public class Demo5Method {
    /*
        方法的弹栈使用：
     */
    public static void isNum(int a, int b) {
        /*
            求a-b之间的所有奇数
            给代码增加一定的健壮性，给定一个判断，当b小于a时，将整个方法退出
         */
        if (b < a) {
            System.out.println("您的输入有误，请重新输入！");
            return; // return; 可以用于结束方法，也就是将方法从栈内存中弹出去
        }
        System.out.println(a + "到" + b + "之间的所有奇数为：");
        for (int i = a; i < b; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
//        isNum(10,20);
        isNum(10, 122);
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("b=" + b);
        System.out.println("a=" + a);
    }

}
