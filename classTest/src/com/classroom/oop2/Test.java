package com.classroom.oop2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point point1= new Point(10,20);
        Point point2= new Point(10,20);
        // 我们在Point类中重载了toString方法，返回x，y的值，这里的打印本意是调用了toString方法
        // 若未在Point类中重载toString方法，以下打印的则是内存地址
        System.out.println(point1);
        System.out.println(point2);

        // 测试移动偏移量
        point1.move(3.14,3.25);
        point2.move(6.14,8.25);
        System.out.println("移动后的1坐标: " + point1);
        System.out.println("移动后的2坐标: " + point2);

        // 测试移动到的坐标
        point1.moveTo(5,6);
        point2.moveTo(6,2);
        System.out.println("增加偏移量后的移动位置1：" + point1);
        System.out.println("增加偏移量后的移动位置2：" + point2);

        // 调用equals方法判断当前两点是否为同一点
        System.out.println("1点与2点的位置是否为同一点：" + point1.equals(point2));

        Segment seg = new Segment(point1,point2);
        System.out.printf("1到2的距离为：%.2f\n",seg.getLength(point1,point2));

        // 创建一个圆对象，打印默认圆的圆心坐标和半径
        Circle c1 = new Circle();
        System.out.println(c1);

        // 统计当前系统存在多少个点
        System.out.println(Point.count_points);

    }
}
