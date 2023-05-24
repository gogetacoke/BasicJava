package com.example.fors;

public class For1 {
    public static void main(String[] args) {
        // 案例一，求100以内的所有偶数打印出来，并计算和
        //分析：1、能被2整除的数就是偶数；2、怎样才能被2整除？将每个数与2相除如果余数为0就是o数

//        int sum = 0;
//        for (int i=1;i<=100;i++){
//            if (i%2==0){
//                sum += i;
//            }
//        }
//        System.out.println("1-100中的偶数和为：" + sum);

        // 案例二，求1000以内的水仙花数
        /*分析：1、水仙花数必须是一个三位数；
               2、三位数每位数的立方和等于这个三位数*/

//        for (int i =100; i<=1000;i++){
//            int ge = i %10;
//            int shi = i /10 %10;
//            int bai = i /10 /10 %10;
//            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
//                System.out.println(i);
//            }
//        }

        //案例三，每行打印两个水仙花数
        /*分析:
         * 1、pint打印不换行；println是换行的
         * 2、设置一个计数器count，每次打印count都加1如果是2的倍数就才换行
         * */
        int count=0;
        for (int i =100; i<=1000;i++){
            int ge = i %10;
            int shi = i /10 %10;
            int bai = i /10 /10 %10;
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.print(i + " ");
                count++;
                if (count%2==0){
                    System.out.println();
                }
            }
        }
    }
}
