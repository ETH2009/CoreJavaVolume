package com.javacore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * 第六章 接口、lambda表达式和内部类
 * 程序清单6-8 Page 266 匿名内部类
 *
 * @author 王国强
 * @version 1.01 2021-02-28
 */

public class JavaCore6_8 {
    public static void main(String[] args) {
        var clock = new TalkingClock1();
        clock.start(1500, true);
        JOptionPane.showMessageDialog(null, "退出么？");
        System.exit(0);
    }
}

class TalkingClock1 {
    public void start(int interval, boolean beep) {
        var listener = new ActionListener() { // 实现了接口ActionListener的匿名内部类
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
}