package com.javacore.abstractClasses5_4;

/**
 * 第五章 继承
 * 程序清单5-5 Page-172 抽象类
 *
 * @author wgq
 * @version 1.0 2021.2.17
 */
public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
