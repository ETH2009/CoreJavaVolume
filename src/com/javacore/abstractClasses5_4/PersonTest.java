package com.javacore.abstractClasses5_4;

/**
 * 第五章 继承
 * 程序清单5-4 page171 抽象类
 *
 * @author wgq
 * @version 1.01 2021/02/17
 */
public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];
        people[0] = new Employee("胡汉三", 666666, 1999, 9, 2);
        people[1] = new Student("三毛流浪记", "历史");
        for (Person p : people)
            System.out.println(p.getName() + "，" + p.getDescription());
    }
}
