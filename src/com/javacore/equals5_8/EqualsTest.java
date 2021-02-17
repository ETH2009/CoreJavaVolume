package com.javacore.equals5_8;

/**
 * 第五章 继承
 * 程序清单5-8 Page-183 判等/哈希码/toString
 */
public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("爱丽丝", 75000, 1983, 12, 15);
        var alice2 = alice1;
        var alice3 = new Employee("爱丽丝", 75000, 1983, 12, 15);
        var bob = new Employee("邦德", 50000, 2000, 11, 7);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
        System.out.println("bot.toString(): " + bob.toString());

        var carl = new Manager("卡尔", 80000, 2017, 12, 5);
        var boss = new Manager("卡尔", 80000, 2017, 12, 5);
        boss.setBonus(5000);
        System.out.println("boos.toString(): " + boss.toString());
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}
