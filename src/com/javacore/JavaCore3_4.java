package com.javacore;

import java.util.Scanner;

/**
 * 第三章 Java的程序设计结构
 * 程序清单3-4 Page 68 do while循环
 *
 * @author 王国强
 * @version 1.20 2021-02-13
 */
public class JavaCore3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("你每年缴纳多少钱的社保：");
        double payment = in.nextDouble();
        System.out.print("利息是多少（%）：");
        double interestRate = in.nextDouble();
        double balance = 0;
        int year = 0;
        String input;
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
            System.out.printf("%d年后你的社保余额将有%,.2f%n元", year, balance);
            System.out.print("你要退休了吗？(Y/N): ");
            input = in.next();
        }
        while (input.equals("N"));
    }
}
