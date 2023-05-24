package com.example.arraylist;

import java.util.ArrayList;

public class Demo1ArrayList {
    /*
        ArrayList构造方法：
            ArrayList() 构造一个容量为10的空列表
        成员方法：
            添加：
                boolean add(E e) 将指定的元素添加到列表的尾部
                void add(int index, E element) 将指定元素插入到列表中指定的位置
            删除：
                boolean remove(object o)删除指定的元素，返回删除成功
                E remove(int index) 删除指定索引处的元素，返回被删除的元素
            修改：
                E set(int index,E element)修改指定索引出的元素，返回被修改的元素
            查询：
                E get(int index)返回指定索引处的元素
                int size() 返回集合中的元素个数
        注意：
            集合容器如果没有加入<> 就可以存储任意数据类型
            <>泛型:对集合容器存储的数据类型进行限制
     */

    public static void main(String[] args) {
        arrayAdd();
        arrayRmove();
        arraySet();
        arrayGet();
    }

    private static void arrayGet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        // 查询方法
        String s = list.get(0);  // 返回第0号索引位置的元素
        int i = list.size(); // 返回集合中元素的个数
        System.out.println(s);
        System.out.println(i);
        /*输出结果
         * 111
         * 4
         */
    }

    private static void arraySet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        // 使用set方法
        String s = list.set(1, "666");// 返回被修改的元素
        System.out.println(s);
        System.out.println(list);
        arrayRmove();
        /* 输出结果
         * 222
         * [111,666,333,444]
         */
    }

    private static void arrayRmove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        // 使用remove方法
        // 1、删除指定元素
        boolean b1 = list.remove("111");
        // 2、删除不存在的元素
        boolean b2 = list.remove("555");
        // 3、删除指定索引处的元素
        String b3 = list.remove(2);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(list);
        /* 输出结果
         * true
         * false
         * 444
         * [222,333]
         */
    }

    private static void arrayAdd() {
        // 1、创建集合容器对象（未指定数据类型）
        ArrayList list = new ArrayList();
        // 指定数据类型
//        ArrayList<String> list1 = new ArrayList<>();
        // 2、调用add方法
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        System.out.println(list); // [111, 222, 333, 444]

        list.add(0, "666");
        System.out.println(list); // [666, 111, 222, 333, 444]
    }
}
