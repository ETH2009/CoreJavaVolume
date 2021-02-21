package com.javacore.JavaCore5_15;

import java.util.ArrayList;

/**
 * 第五章 继承
 * 程序清单5-15 Page 211 使用反射在运行时分析对象
 *
 * @author 王国强
 * @version 1.13 2021/02/21
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
