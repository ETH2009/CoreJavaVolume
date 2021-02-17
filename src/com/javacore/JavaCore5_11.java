package com.javacore;

import com.javacore.equals5_8.Employee;

import java.util.ArrayList;

/**
 * 第五章 继承
 * 程序清单5-11 Page-190 数组列表ArrayList
 *
 * @author wgq
 * @version 1.11 21/02/17
 */
public class JavaCore5_11 {
    public static void main(String[] args) {
        var staff = new ArrayList<Employee>();
        staff.add(new Employee("哪吒", 800, 2013, 12, 11));
        staff.add(new Employee("雷震子", 666, 2012, 1, 15));
        staff.add(new Employee("金吒", 777, 2013, 11, 3));
        for (Employee e : staff)
            e.raiseSalary(5);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }
}
