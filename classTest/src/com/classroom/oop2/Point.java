package com.classroom.oop2;


import java.util.Objects;

public class Point {
    // 定义常量
    public static final String SPACENAEM = "二维空间";

    // static 称为静态类属性；所有的对象共享一份，无论谁修改都会影响到其他人
    // 用于描述一类对象的共享的属性，可通过类名直接调用，也可以通过对象调用;静态方法不能去访问非静态中的方法
    static int count_points = 0;
    // 静态方法需要使用，类.方法名，调用，是用户主动调用的
    static void info(){
        System.out.println("我是静态方法");
    }
    // 静态代码段无需调用，在第一次加载类的时候，自动执行一次
    static {
        System.out.println("这里是" + SPACENAEM);
    }


    private double x;
    private double y;

    public  Point(){
        this(0,0);
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
        count_points++;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }


    /**
     * 移动到指定位置，直接将原来坐标，更改为新的坐标
     * @param x
     * @param y
     */
    public void moveTo(double x,double y){
       this.x = x;
       this.y = y;
    }
    /**
     * 按照x，y进行偏移,在原来坐标上进行相加
     * @param x
     * @param y
     */
    public void move(double x,double y){
        this.x += x;
        this.y += y;
    }

}
