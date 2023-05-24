package com.classroom.oop2;

public class Circle {
    private Point center;
    private double redius;

    // new Point() :这本身只需传center圆心，类型是Point，但圆心是一个坐标，所以这里创建一个坐标对象，来作为圆心
    public Circle(){
        this(new Point(0,0),0.0);
    }

    public Circle(Point center,double redius){
        this.center = center;
        this.redius = redius;
    }
    // 定义一个求圆的面积方法
    public double area(){
        return Math.PI*Math.pow(redius,2);
    }

    public String toString(){
        return "圆心：" + center + "半径：" + redius;
    }
}
