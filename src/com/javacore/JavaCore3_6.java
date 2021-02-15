package com.javacore;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 第三章 Java的基本程序设计结构
 * 程序清单3-6 Page 77 大数（BigInteger和BigDecimal）
 *
 * @author 王国强
 * @version 1.20 2021-02-15
 */
public class JavaCore3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("总共需要抽取多少个数？请输入：");
        int k = in.nextInt();
        System.out.print("可以抽取的最大数字是多少？请输入：");
        int n = in.nextInt();
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("你中奖的概率为1/" + lotteryOdds + "，祝好运！");
    }
}
