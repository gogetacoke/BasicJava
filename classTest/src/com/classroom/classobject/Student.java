package com.classroom.classobject;


import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Objects;

public class Student extends Object{
    // 属性
    String id;
    String name;
    int age;
    // 当你没有主动创建构造方法时，系统会默认存在一个无参构造方法
    // 无惨构造方法
    public Student(){}
    // 当写了一个有参的构造方法时，系统会隐藏无惨的构造方法，若要用无惨的构造方法，需将他写出来。
    public Student(String id, String name, int age){
        // 当类的属性与构造方法的形参相同时，需添加一个this
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 重写父类toString方法
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    int a =3;
    char b ='5';
    char c =(char)(a+b);
//    @Override
//    public boolean equals(Object o) {
//       Student tmp = (Student) o;
//       return tmp.name = this.name;
//    }

}
