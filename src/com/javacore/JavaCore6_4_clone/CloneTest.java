package com.javacore.JavaCore6_4_clone;

/**
 * 第六章 接口、lambda表达式与内部类
 * 程序清单6-4 Page 240 对象克隆
 *
 * @author 王国强
 * @version 1.11 2021/2/28
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("王建国", 6676767);
        original.setHireDay(2003, 8, 7);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 23);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}
