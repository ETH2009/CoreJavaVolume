package com.javacore;

import java.util.Scanner;

/**
 * 第三章 Java的基本程序设计结构
 * 程序清单3-5 Page 71 for循环
 *
 * @author 王国强
 * @version 1.20 2021.02.13
 */
public class JavaCore3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("总共需要抽取多少个数字：");
        int k = in.nextInt();
        System.out.print("可以抽取的最大数字是多少：");
        int n = in.nextInt();
        /*从n个数字中抽取k个数字，会有
         *    n × (n - 1) × (n - 2) × ··· × (n - k + 1)
         * -----------------------------------------------
         *         1 × 2 × 3 × 4 × ··· × k
         * 种可能
         */
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("你中奖的概率是" + "1/" + lotteryOdds + "，Good luck!");
    }
}
