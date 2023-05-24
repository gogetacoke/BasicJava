package com.classroom.enumerate;

import java.util.Locale;

public class EnuTest {
    public static void main(String[] args) {
        // 枚举类测试
        // 枚举类是final类型的，不可以继承重写，enum中的成员属于同一类型
        // CONSTATNT 中的成员可以是不同的类型
        // 枚举类的关键字是enum，常量类就是不同类class
        // 枚举类中的成员不属于任何基本数据类型
        /*
            枚举类中内置的方法
            ordinal() 返回当常量在枚举类中的下标
            valueof() 它的作用是传来一个字符串，然后将它转变为对应的枚举变量。前提是你传的字符串和定义枚举变量的字符串一抹一样，区分大小写。如果你传了一个不存在的字符串，那么会抛出异常。
            compareTo() 该方法用来比较两个枚举变量的”大小”，实际上比较的是两个枚举变量的次序，返回两个次序相减后的结果，如果为负数，就证明变量1”小于”变量2
            values()  该方法会返回包括所有枚举变量的数组。在该例中，返回的就是包含了七个星期的Weekday[]。可以方便的用来做循环。
         */
        System.out.println(WeekDay.FRI.ordinal());
        System.out.println(WeekDay.FRI.compareTo(WeekDay.WED));
        for (WeekDay day: WeekDay.values()){
            System.out.println(day);
        }
        System.out.println(WeekDay.valueOf("fri".toUpperCase(Locale.ROOT)));
    }
}
