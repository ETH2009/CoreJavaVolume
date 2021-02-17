package com.javacore.abstractClasses5_4;

/**
 * 第五章 继承
 * 程序清单5-7 Page-173 继承抽象类的子类
 *
 * @author 王国强
 * @version 1.0 2021-02-17
 */
public class Student extends Person {
    private String major; // 主修

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return String.format("一个主修%s课程的同学😀", major);
    }
}
