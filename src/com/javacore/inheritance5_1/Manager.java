package com.javacore.inheritance5_1;

/**
 * 第五章 继承
 * 程序清单5-3 Page 161 子类
 *
 * @author 王国强
 * @version 1.0 2021-02-17
 */
public class Manager extends Employee {
    private double bonus; // 奖金

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
