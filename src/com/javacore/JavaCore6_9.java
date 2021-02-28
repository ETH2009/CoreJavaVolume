package com.javacore;

/**
 * 第六章 接口、lambda表达式与内部类
 * 程序清单6-9 Page 269 静态内部类
 *
 * @author wgq
 * @version 1.02 2015-05-12
 */
public class JavaCore6_9 {
    public static void main(String[] args) {
        var values = new double[20];
        for (int i = 0; i < values.length; i++)
            values[i] = Math.random() * 100;
        ArrayAlg.Pair p = ArrayAlg.minmax(values);
        System.out.println("min=" + p.getFirst() + ",max=" + p.getSecond());
    }
}

class ArrayAlg {
    public static class Pair {
        private double first;
        private double second;

        public Pair(double f, double s) {
            first = f;
            second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY; // 正无穷 = 1.0 / 0.0
        double max = Double.NEGATIVE_INFINITY; // 负无穷 = -1.0 / 0.0
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}