package com.javacore;

import java.util.Arrays;

/**
 * 第三章 Java的基本程序设计结构
 * 程序清单3-8 Page 87 多维数组
 *
 * @author 王国强
 * @version 1.40 2021-02-15
 */
public class JavaCore3_8 {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;
        // 利率数组
        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++)
            interestRate[i] = (STARTRATE + i) / 100.0;
        // 余额关于年份和利率的二维数组
        double[][] balances = new double[NYEARS][NRATES];
        // 初始化余额
        Arrays.fill(balances[0], 10000);
        // 计算不同利率下资产累积
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double oldBalance = balances[i - 1][j];
                double interest = oldBalance * interestRate[j]; // 利息
                balances[i][j] = oldBalance + interest; // 今年余额=去年余额+今年利息
            }
        }
        // 输出
        for (double v : interestRate) System.out.printf("%9.0f%%", 100 * v);
        System.out.println();
        for (double[] row : balances) {
            for (double b : row) System.out.printf("%10.2f", b);
            System.out.println();
        }
    }
}
