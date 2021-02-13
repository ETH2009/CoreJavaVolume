package com.javacore;

import java.util.Scanner;

/**
 * 第三章 Java的基本程序设计结构
 * 程序清单3-3 Page 68 循环
 *
 * @author 王国强
 * @version 1.20 2013-02-13
 */
public class JavaCore3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("你退休之后想领多少退休金：");
        double goal = in.nextDouble();
        System.out.print("你每年缴纳多少钱的社保：");
        double payment = in.nextDouble();
        System.out.print("利率是多少(%)：");
        double interestRate = in.nextDouble();
        double balance = 0; // balance 余额
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("你需要缴纳社保" + years + "年！");
    }
}
