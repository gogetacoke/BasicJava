package com.classroom.testoop2;

public class Truck extends Vechicle{
    // 载重
    private int load;

    // 构造方法
    public Truck(){
    }

    public Truck(int load){
        this.load = load;
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("\n当前卡车载重为：%d吨\n",this.load);
    }
}
