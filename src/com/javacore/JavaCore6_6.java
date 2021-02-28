package com.javacore;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * 第六章 接口、lambda表达式与内部类
 * 程序清单6-6 Page 244 lambda表达式
 *
 * @author 王国强
 * @version 1.01 2021-2-28
 */
public class JavaCore6_6 {
    public static void main(String[] args) {
        // 排序 planet 行星
        var planets = new String[]{"Mercury水星", "Venus金星", "Earth地球", "Mars火星", "Jupiter木星", "Saturn土星", "Uranus天王星", "Neptune海王星"};
        System.out.println(Arrays.toString(planets));
        System.out.println("按字典排序：");
        // [Earth地球, Jupiter木星, Mars火星, Mercury水星, Neptune海王星, Saturn土星, Uranus天王星, Venus金星]
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("按名字的长度排序：");
        // [Mars火星, Earth地球, Venus金星, Saturn土星, Jupiter木星, Mercury水星, Uranus天王星, Neptune海王星]
        Arrays.sort(planets, (first, second) -> first.length() - second.length()); // lambda表达式作为参数
        System.out.println(Arrays.toString(planets));

        var timer = new Timer(3000, event ->
                System.out.println("The time is " + new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null, "退出不？");
        System.exit(0);
    }
}
