package com.javacore.abstractClasses5_4;

import java.time.LocalDate;

/**
 * 第五章 继承
 * 程序清单5-6 Page-172 继承抽象类Person的子类
 *
 * @author 王国强
 * @version 1.0 2021.02.17
 */
public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("一个月薪￥%.2f的员工~", salary);
    }
}
