package com.classroom.testoop1;

public class Account {
    private String id;
    private String owner;
    private double balance;

    public Account() {
    }

    public Account(String id, String owner, double balance) {
        if (id.equals("") || id.equals(" ") || owner.equals("") || owner.equals(" ")) {
            System.out.println("您输入的信息有误，请重新输入！");
        } else {
            this.id = id;
            this.owner = owner;
            this.balance = balance;
        }
    }

    // 修改父类中的toString方法，返回数据值
    @Override
    public String toString() {
        return "用户{" +
                "id='" + id + '\'' +
                ", 姓名='" + owner + '\'' +
                ", 余额=" + balance +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // 编写一个金额存储方法，判断用户的ID是否存在，若不存在就提醒用户，存在完成余额+=amount
    public void dePosit(double amount) {
        if (id == null) {
            System.out.println("并无当前账户，请检查后，继续操作！");
        }else {
            balance += amount;
            System.out.println("-----------------------------------------");
            System.out.printf("当前用户:%s\n存款：%s\n余额：%s\n",owner,amount,balance);
            System.out.println("-----------------------------------------");
        }
    }

    // 编写一个取出方法
    public void withDrew(double amount) {
        if (id == null) {
            System.out.println("并无当前账户，请检查后，继续操作！");
        }else if(amount > balance){
            System.out.println("当前余额足！");
            System.out.println("当前余额还剩余：" + balance);
        }else {
            balance -= amount;
            System.out.println("-----------------------------------------");
            System.out.printf("当前用户:%s\n取款：%s\n余额：%s\n",owner,amount,balance);
            System.out.println("-----------------------------------------");
        }
    }

    // 编写一个查询方法
    public void query() {
        if (id == null){
            System.out.println("并无当前账户，请检查后，继续操作！");
        }else {

            System.out.printf("当前账户ID：%s\n" + "账户姓名：%s\n" + "总资产为：%.2f", id, owner, balance);
        }
    }
}
