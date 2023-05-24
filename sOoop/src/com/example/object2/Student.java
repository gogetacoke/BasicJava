package com.example.object2;

public class Student {
    /*
        private:私有的
        private是一个权限修饰符，可以用来修饰成员（方法、变量）
        特点：只能在本类中才能进行访问
        若外界需要访问，需定义一个set方法通道来进行设置值，定义一个get方法通道来进行获取值，如果设置了
        private那么外界访问成员变量使用“对象.变量”的方式将不呢访问到该变量值，只能通过set方法设置值
        get方法来获取值。
     */
    String name;
    // 未设置私有属性age
//    int age;
    // 设置私有属性age
    private int age;

    public void getAge(int num) {
        // 判断传入的age是否合理
        if (num>=0 && num<=120){
            age = num;
        }else {
            System.out.println("您输入的年龄有误！");
        }
    }


    public int setAge(){
        return age;
    }

    public void study() {
        System.out.println(name + "正在学习！！" + age);
    }
}
