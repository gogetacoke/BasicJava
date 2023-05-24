package com.classroom.oop3;

public class Teacher extends Person {
    String school;
    String name; //与父类属性相同，父类的相同属性会被覆盖


    public Teacher(String id, String school, String name) {
        // 子类构造方法的第一行，默认调用父类的无参构造
//        super();
        // 明确使用父类的有参构造时，父类的无参构造可以不存在
        super(id, name);
//        this.id = id;
        this.school = school;

        // super.name 代表使用的是父类的name属性
//        super.name = name;

        super.name = name + "学生";
    }

    /**
     * 重写描述的是子类与父类中，同名同参数列表的方法表现出来的多态
     * 方法名的声明完全相同，只是方法实现不同
     */
    @Override
    public void introduce() {
        System.out.println("我叫" + name + "，就职于：" + school + "，国籍是：" + country);
    }
    /**
     * 重载描述的是同一个类，两个以上同名方法的多态形式
     * 参数列表不同:
     * 参数个数、顺序、类型
     */
    public void introduce(int money,String room) {
        System.out.println("我叫" + name + "，现在正在：" + room + "教室进行授课，我的入场券为：" + money + "元。 ");
    }
    public void introduce(String room,int money) {
        System.out.println("我叫" + name + "，就职于：" + school + "，国籍是：" + country);
    }


}
