package com.javacore.package4_7;

import static java.lang.System.out; // 静态导入

/**
 * 第四章 对象与类
 * 程序清单4-6 Page 138 包
 *
 * @author 王国强
 * @version 1.11 2021-02-16
 */
public class JavaCore4_6 {
    public static void main(String[] args) {
        // Employee定义在当前包中 -- com.javacore.package4_7
        var harry = new Employee("汤姆克鲁斯", 5000, 1989, 10, 1);
        harry.raiseSalary(5);
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}
