package com.javacore;

import java.util.Locale;
import java.util.Scanner;

/**
 * 第五章 继承
 * 程序清单5-12 page 197 枚举类enum
 *
 * @author wangguoqiang
 * @version 1.0 2021/02/17
 */
public class JavaCore5_12 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("请输入一个尺寸号码（SMALL/MEDIUM/LARGE/EXTRA_LARGE）："); // extra large 超大号
        String input = in.next().toUpperCase(Locale.ROOT);
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == size.EXTRA_LARGE)
            System.out.println("Good job--your paid attention to the _.");
    }
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
