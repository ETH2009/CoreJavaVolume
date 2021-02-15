package com.javacore;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 第四章 对象和类
 * 程序清单4-1 Page 102 面向对象
 *
 * @author 王国强
 * @version 1.5 2021-02-15
 */
public class JavaCore4_1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // 现在的日期
        // LocalDate date = LocalDate.of(2021, 1, 10);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1); // 定位到本月1号
        DayOfWeek weekday = date.getDayOfWeek(); // 星期对象
        int value = weekday.getValue(); // 星期几
        // System.out.println(month + " " + today + " " + value);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
