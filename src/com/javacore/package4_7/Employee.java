package com.javacore.package4_7;

import java.time.LocalDate;

/**
 * 第四章 对象和类
 * 程序清单4-7 Page 139 包
 *
 * @author 王国强
 * @version 1.11 2021-02-16
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        System.out.println("当前包：package com.javacore.package4_7");
        this.name = name;
        this.salary = salary;
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
        double raise = salary * byPercent / 100.0;
        salary += raise;
    }
}
