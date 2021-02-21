package com.javacore.JavaCore5_15;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * 第五章 继承
 * 程序清单5-16 Page 211 使用反射在运行时分析对象
 *
 * @author 王国强
 * @version 1.01 2021-02-21
 */
public class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>(); // visited 参观过的

    public String toString(Object obj) throws ReflectiveOperationException {
        if (obj == null) return "null";
        if (visited.contains(obj)) return "...";
        visited.add(obj);
        Class cl = obj.getClass();
        if (cl == String.class) return (String) obj;
        if (cl.isArray()) {
            String r = cl.getComponentType() + "[]{";
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) r += ",";
                Object val = Array.get(obj, i);
                if (cl.getComponentType().isPrimitive()) r += val; // 原生数据类型
                else r += toString(val); // 递归调用toString
            }
            return r += "}";
        }
        String r = cl.getName();
        // 查看这个类及其父类的所有字段
        do {
            r += "{";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true); // 使所有字段对象数组fields中元素均可访问（该方法会覆盖Java访问限制）
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.endsWith("[")) r += ",";
                    r += f.getName() + "=";
                    Class t = f.getType();
                    Object val = f.get(obj); // 获取该对象中f所对应字段的值
                    if (t.isPrimitive()) r += val;
                    else r += toString(val); // 递归调用直到是原生类型
                }
            }
            r += "]";
        } while (cl != null);
        return r;
    }
}
