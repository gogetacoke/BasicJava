package com.example.mehod;

public class Demo4Method {
    /*
        带有返回值的函数定义
            public static  (需要return返回值得数据类型一致)int 方法名(形参1,形参2){
                return int;
            }
        带有返回值函数的调用
        数据类型 变量名 = 方法名(实参);
        int a = a(1,2);
     */
    public static int add(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int num = add(10,20);
        System.out.println(num);
    }
}
