package com.javacore;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 第三章 Java的基本程序设计结构
 * 程序清单3-7 Page 84 数组 array
 *
 * @author 王国强
 * @version 1.20 2021-02-15
 */
public class JavaCore3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("总共需要抽取多少个数？请输入：");
        int k = in.nextInt();
        System.out.print("可以抽取的最大数是多少？请输入：");
        int n = in.nextInt();
        // 创建数组
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;
        // 抽奖
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            // 在0到n（包括0，不包括n）之间随机一个数
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        // 对抽中的数排序
        Arrays.sort(result);
        System.out.println("你的下注组合如下，它会让你暴富，哈哈哈");
        for (int r : result)
            System.out.printf("%02d ", r);
    }
}
