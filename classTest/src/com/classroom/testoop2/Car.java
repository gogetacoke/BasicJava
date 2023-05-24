package com.classroom.testoop2;

public class Car extends Vechicle{
    // 座位
    private int seats;

    // 构造方法
    public Car() {
    }

    public Car(int seats){
        this.seats = seats;
    }

    // 重写成员方法
    @Override
    public void show() {
        super.show();
        System.out.printf("\n当前汽车为：%d座汽车\n", seats);
    }
}
