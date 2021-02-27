package com.javacore.JavaCore6_1_interfaces;

/**
 * 第六章 接口、lambda表达式与内部类
 * 程序清单6-2 Page 226 接口
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100;
    }

    /**
     * 实现接口中生命的compareTo方法
     *
     * @param other 另一个Employee对象
     * @return +/0/-
     */
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary); // 以薪资比大小
    }
}
