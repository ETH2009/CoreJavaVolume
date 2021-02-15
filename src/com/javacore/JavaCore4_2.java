package com.javacore;

import java.time.LocalDate;

/**
 * 第四章 对象与类
 * 程序清单4-2 Page 105 自定义类
 *
 * @author 王国强
 * @version 1.13 2021-02-15
 */
public class JavaCore4_2 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("吕秀才", 8000.0, 2020, 1, 4);
        staff[1] = new Employee("郭芙蓉", 10000, 1999, 4, 9);
        staff[2] = new Employee("白展堂", 15000, 2001, 5, 15);
        for (Employee e : staff)
            e.raiseSalary(5);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}