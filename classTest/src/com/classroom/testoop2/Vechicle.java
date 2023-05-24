package com.classroom.testoop2;

// 定义一个交通工具类
public class Vechicle {
    // 设置速度属性
    private double speed;
    // 无参构造
    public Vechicle(){}
    // 有参构造
    public Vechicle(int speed){
        this.speed = speed;
    }
    // 移动方法-匀速度
    private void movie(int time){
        // 距离
        double distance;
        // 匀速度计算
        distance = speed/time;
        System.out.println("匀速度: " + speed + "km/h" + "移动距离: " + distance + "km" + "用时: " + time + "h");
    }
    // 移动方法-加速度
    private void movie(int time,int acceleratedSpeed){
        // 距离
        double distance;
        // 加速度计算
        distance = acceleratedSpeed*Math.pow(time,2)/2;
        System.out.println("加速度: " + acceleratedSpeed + "km/h" + "移动距离: " + distance + "km" +  "用时: " + time + "h");

    }
    // 设置速度方法
    public void setSpeed(int speed){
        this.speed = speed;
    }
    // 加速方法
    public void speedChange(int time, int acceleratedSpeed){
        /*
          根据加速度的值来判断当前汽车属于加速度还是均速度
         */
        if (acceleratedSpeed == 0){
            movie(time);
        }else {
            movie(time,acceleratedSpeed);
        }
    }
    // 输出交通工具属性方法
    public void  show(){
        System.out.printf("当前速度为：%.1fkm/h", this.speed);
    }

}
