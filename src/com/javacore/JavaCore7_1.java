package com.javacore;

import java.util.Scanner;
import java.util.Stack;

/**
 * 第7章 异常、断言和日志
 * 程序清单7-1 捕获异常
 *
 * @author 王国强
 * @version 1.10 2021-03-14
 */
public class JavaCore7_1 {
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            System.out.print("请输入一个正整数：");
            int n = in.nextInt();
            int res = factorial(n);
            // System.out.println("res=" + res);
        }
    }

    /**
     * 计算一个正整数的阶乘
     *
     * @param n 一个正整数
     * @return n! = 1 * 2 * ... * (n - 1) * n
     */
    public static int factorial(int n) {
        // 分析堆栈轨迹
        System.out.println("factorial(" + n + ");");
        var walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }
}
