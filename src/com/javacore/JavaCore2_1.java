package com.javacore;

/**
 * 第2章 Java程序设计环境
 * 程序清单2-1 Page 17
 *
 * @author 王国强
 * @version 1.30 2021-02-11
 */

public class JavaCore2_1 {

    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!"; // greeting: 问候语
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
