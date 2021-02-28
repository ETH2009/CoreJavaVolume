package com.javacore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * 第六章 接口 lambda表达式 内部类
 * 程序清单6-3 Page 234 接口与回调
 *
 * @author 王国强
 * @version 1.02 2021-02-28
 */
public class JavaCore6_3 {
    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();
        Timer timer = new Timer(5000, listener); // 定时器
        timer.start();
        JOptionPane.showMessageDialog(null, "退出不？");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
