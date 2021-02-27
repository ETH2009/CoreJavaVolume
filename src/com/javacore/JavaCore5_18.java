package com.javacore;

import java.lang.reflect.Method;

/**
 * 第五章 继承
 * 程序清单5-18 Page 217 调用任意方法和构造器
 * getMethod方法的签名: Method getMethod(String name, Class<?>... parameterTypes)
 *
 * @author 王国强
 * @version 1.01 2021/2/27
 */
public class JavaCore5_18 {
    public static void main(String[] args) throws ReflectiveOperationException {
        // 得到方法square和sqrt的指针
        Method square = JavaCore5_18.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        printTable(1, 10, 10, square); // 打印从1到10之间10个数的平方
        printTable(1, 10, 10, sqrt); // 平方根
    }

    /**
     * 返回一个数的平方
     *
     * @param x 一个数
     * @return x的平方
     */
    public static double square(double x) {
        return x * x;
    }

    public static void printTable(double from, double to, int n, Method f) throws ReflectiveOperationException {
        System.out.println(f);
        double dx = (to - from) / (n - 1);
        for (double x = from; x <= to; x += dx) {
            double y = (Double) f.invoke(null, x); // 第一个参数是f所属的对象，由于此处f为静态方法，故为null，后面是显示参数
            System.out.printf("%10.4f | %10.4f%n", x, y); // java中%n是换行 %10.4 --总共占10位，小数点后4位，右对齐
        }
    }
}
