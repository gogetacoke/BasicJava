package com.example.object2;

public class TestStudent {
    public static void main(String[] args) {
        // 类中成员变量未设置私有属性
        Student stu = new Student();
        // 成员变量中 age的变量属性是int，那么赋值成负数就不合理
//        stu.age = 18;
//        stu.age = -18;
//        stu.name = "小王";
//        stu.study();
        /*
            正确赋值结果：小王正在学习！！18
            错误赋值结果：小王正在学习！！-18
         */

        // 未了使值赋值有意义，在类中将age成员变量设置为私有属性，并对获取的值进行判断
        // 设置值
//        stu.getAge(10);
        stu.getAge(-10); // 设置-10不满足getAge方法中的条件，那么就没有对应的值。只能返回age的默认值，因为是int其默认值为0
        // 获取值
        stu.setAge();
        stu.name = "小张";
        stu.study();;

        /*
            合理的年龄值输出：小张正在学习！！10
            不合理的年龄输出：小张正在学习！！0
         */
    }
}
