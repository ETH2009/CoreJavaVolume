package com.javacore.JavaCore6_1_interfaces;

import java.util.Arrays;

/**
 * 第六章 接口、lambda表达式、内部类
 * 程序清单6-1 Page 225 接口 排序
 *
 * @author wgq
 * @version 1.30 2021-02-27
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("海伦凯勒", 35000);
        staff[1] = new Employee("达叔再见", 99999.9);
        staff[2] = new Employee("黄家驹", 88888);
        Arrays.sort(staff); // 排序
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
