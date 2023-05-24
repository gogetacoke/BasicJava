package com.classroom.innerclass;

public class Outer {
    private String name = "外部类";


    public void printName(){
        // 外部类访问内部类时，需要先新建内部类对象，对象.属性，才能访问。
        /*
            外部类可以访问内部类对象的所有成员属性方法
         */
        Inner inner = new Inner();
        System.out.println(inner.name);
        System.out.print("调用内部类的打印方法：");
        inner.printName();
    }

    // 内部类
    /*
        内部类可以用所有的访问权限修饰符，进行修饰
        如果内部类使用private修饰，那么在Outer之外，将不能创建Inner对象
     */
    class Inner{
        // 内部类里面不可定于静态属性(static)和方法
        private String name="内部类";
        protected void printName(){
            System.out.println(name);
            // 类.this.属性 表示外部类当前对象的某个属性
            // inner 可以访问Outer的所有成员
            System.out.println(Outer.this.name); // 访问外部对象
        }
    }
    // 匿名内部类的对象创建，需要跟随{}，在其中重新部分方法
    private InnerClass getInner(){
        return new InnerClass() {
            @Override
            public void printLocation() {
                System.out.println("你点击了我");
            }
        };
    }
}
