package com.javacore.equals5_8;

/**
 * 第五章 继承
 * 程序清单5-10 page-185 equals/hashCode/toString
 *
 * @author wgq
 * @version 1.01 2021/2/17
 */
public class Manager extends Employee {
    private double bonus;

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

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        var other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), bonus);
    }

    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
