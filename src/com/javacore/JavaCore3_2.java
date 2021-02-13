package com.javacore;

import java.util.Scanner;

/**
 * 第三章 Java的基本程序设计结构
 * 程序清单3-2 Page 56 输入与输出
 *
 * @author 王国强
 * @version 1.10 2021-02-13
 */
public class JavaCore3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("你的名字是什么？");
        String name = in.nextLine();
        System.out.print("你的年龄是多少？");
        int age = in.nextInt();
        System.out.println("你好，" + name + "，明年你就" + (age + 1) + "岁了！");
    }
}
