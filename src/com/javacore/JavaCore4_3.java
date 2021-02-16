package com.javacore;

/**
 * 第四章 对象与类
 * 程序清单4-3 Page 119 静态字段和静态方法
 *
 * @author 王国强
 * @version 1.02 2021.02.16
 */
public class JavaCore4_3 {
    public static void main(String[] args) {
        var staff = new Employee1[3];
        staff[0] = new Employee1("黄飞鸿", 135342);
        staff[1] = new Employee1("霍元甲", 21222);
        staff[2] = new Employee1("叶问", 532367);
        for (Employee1 e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary" + e.getSalary());
        }
        int n = Employee1.getNextId();
        System.out.println("下一个可用的id是" + n);
    }
}

class Employee1 {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee1(String n, double s) {
        name = n;
        salary = s;
        id = 0;
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

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        var e = new Employee1("单元测试王二小", 5000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}