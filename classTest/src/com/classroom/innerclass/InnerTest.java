package com.classroom.innerclass;

public class InnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printName();

        Outer.Inner inner = outer.new Inner();
        /*
            在外部内以外的位置，将内部类当作一个普通类使用即可，特别注意属性和成员的访问权限修饰符。
         */
        System.out.println("内部类的名字:");
        inner.printName();
    }
}
