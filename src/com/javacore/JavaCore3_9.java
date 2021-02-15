package com.javacore;

/**
 * 第三章 Java的基本程序设计结构
 * 程序清单3-9 Page 90 不规则数组
 *
 * @author 王国强
 * @version 1.20 2021-02-15
 */
public class JavaCore3_9 {
    public static void main(String[] args) {
        final int NMAX = 10;
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                odds[n][k] = lotteryOdds;
            }
        }
        // 输出
        for (int[] row : odds) {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}
