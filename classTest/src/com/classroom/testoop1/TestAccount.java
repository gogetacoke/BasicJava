package com.classroom.testoop1;

public class TestAccount {
    public static void main(String[] args) {
        // 实例化一个用户，给予id、name、余额
        Account account = new Account("123","12",1000);
//        System.out.println(account);
        // 调用dePosit方法存储金额
        account.dePosit(5000);
        // 调用withDrew方法取出金额
//        account.withDrew(50000);
        // 查询当前用户信息
        account.query();
//        Account account1 = new Account();
//        account1.withDrew(500);
//        account1.query();

    }

}
