package com.classroom.oop3;

public class Person {
    /*
        在同一个包中，父类中用public、protected、缺省，修饰的属性方法、方法均可被被继承
        在不同的包中，父类中用public、protected修饰的属性、方法均可被继承
     */
     String country = "China";
     String id;
     String name;

     public Person(){
         System.out.println("我是Person无参构造");
     }

     public Person(String id,String name){
         this.name = name;
         this.id = id;
     }

     public void introduce(){
         System.out.println("我叫" + name + "，国籍是：" +country);
     }

}
