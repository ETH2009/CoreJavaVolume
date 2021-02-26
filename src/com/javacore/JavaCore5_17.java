package com.javacore;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 第五章 继承
 * 程序清单5-17 Page 214 使用反射编写泛型数组代码
 *
 * @author 王国强
 * @version 1.01 2021/2/26
 */
public class JavaCore5_17 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        // a = (int[]) badCopyOf(a, 10); // 参数a不符合Object[]类型要求，int不是一个Object
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"葫芦娃", "黑猫警长", "辛巴", "小叮当"};
        b = (String[]) goodCopyOf(b, 11);
        System.out.println(Arrays.toString(b));

        System.out.println("错误示范，将抛出一个异常："); // java.lang.ClassCastException
        b = (String[]) badCopyOf(b, 11);
    }

    /**
     * 一个错误的示范
     */
    public static Object[] badCopyOf(Object[] a, int newLength) {
        var newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * 复制一个数组至一个更大的数组
     *
     * @param a         原数组
     * @param newLength 心数组长度
     * @return 一个更大的数组，包含原数组所有元素
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType(); // 获取数组元素类型
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
