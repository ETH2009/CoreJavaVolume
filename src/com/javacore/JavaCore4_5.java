package com.javacore;

import java.util.Random;

/**
 * 第四章 对象与类
 * 程序清单4-5 Page 132 对象构造
 *
 * @author 王国强
 * @version 1.02 2021.02.16
 */
public class JavaCore4_5 {
    public static void main(String[] args) {
        var staff = new Employee3[3];
        staff[0] = new Employee3("言承旭", 454344);
        staff[1] = new Employee3(45435444);
        staff[2] = new Employee3();
        for (Employee3 e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
    }
}

class Employee3 {
    private static int nextId; // 静态字段

    private int id;
    private String name = ""; // 实例字段初始化
    private double salary;

    // 静态初始化块
    static {
        var generator = new Random();
        nextId = generator.nextInt(10000); // 生成一个0~9999之间的随机数
    }

    // 对象初始化块
    {
        id = nextId;
        nextId++;
    }

    // 三个重载的构造方法
    public Employee3(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee3(double s) {
        // 在构造方法中调用另一个构造方法
        this("雇员#" + nextId, s);
    }

    // 默认构造方法
    public Employee3() {
        // name初始化为""
        // salary系统自动初始化为0
        // id在初始化块中初始化
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}