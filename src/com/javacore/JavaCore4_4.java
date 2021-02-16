package com.javacore;

/**
 * 第四章 对象和类
 * 程序清单4-4 Page 124 方法参数
 *
 * @author 王国强
 * @version 1.01 2021-02-16
 */
public class JavaCore4_4 {
    public static void main(String[] args) {
        /*
         * 调用方法不能改变数字型参数
         */
        System.out.println("测试将基本类型的值扩大三倍：");
        double percent = 10;
        System.out.println("扩大前：percent=" + percent);
        tripleValue(percent);
        System.out.println("扩大后：percent=" + percent);
        /*
         * 调用方法可以改变对象参数的状态
         */
        System.out.println("测试将雇员对象的工资扩大三倍：");
        var harry = new Employee2("汤姆汉克斯", 5000);
        System.out.println("扩大前：salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("扩大后；salary=" + harry.getSalary());
        /*
         * Java方法的调用是值传递，而非引用传递，不能完成对象引用的交换
         */
        System.out.println("测试交换引用：");
        var a = new Employee2("郭德纲", 7899);
        var b = new Employee2("岳云鹏", 78666);
        System.out.println("交换前：a=" + a.getName() + ", b=" + b.getName());
        swap(a, b);
        System.out.println("交换后：a=" + a.getName() + ", b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("方法的最后：x=" + x);
    }

    public static void tripleSalary(Employee2 x) {
        x.raiseSalary(200);
        System.out.println("方法的最后：salary=" + x.getSalary());
    }

    public static void swap(Employee2 x, Employee2 y) {
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("方法的最后：x=" + x.getName() + ", y=" + y.getName());
    }
}

class Employee2 {
    private String name;
    private double salary;

    public Employee2(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100.0;
    }
}