package com.javacore;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * 第五章 继承
 * 程序清单5-14 Page 205 利用反射分析类的能力
 *
 * @author WGQ
 * @version 1.11 2021-02-21
 */

public class JavaCore5_14 {
    public static void main(String[] args) throws ReflectiveOperationException {
        // 读取命令行参数或者让用户输入
        String name;
        if (args.length > 0) name = args[0];
        else {
            var in = new Scanner(System.in);
            System.out.print("请输入一个类名（如java.util.Date）：");
            name = in.next();
        }
        // 打印类和超类的名字
        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();
        String modifiers = Modifier.toString(cl.getModifiers()); // 获取修饰符
        if (modifiers.length() > 0) System.out.print(modifiers + " ");
        System.out.print("class " + name); // 类的名字
        if (supercl != null && supercl != Object.class) System.out.print(" extends " + supercl.getName()); // 父类
        System.out.print("\n\n");
        printConstructors(cl);
    }

    /**
     * 打印一个类的所有构造器
     *
     * @param cl 一个类对象
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getConstructors();
        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");
            // 打印参数类型
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
}

