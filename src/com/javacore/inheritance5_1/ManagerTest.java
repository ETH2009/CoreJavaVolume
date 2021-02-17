package com.javacore.inheritance5_1;

/**
 * 第五章 继承
 * 程序清单5-1 Page 160 继承
 *
 * @author 王国强
 * @version 1.21 2021.02.17
 */
public class ManagerTest {
    public static void main(String[] args) {
        var boss = new Manager("王者荣耀", 80900, 1998, 1, 31);
        boss.setBonus(999999);
        var staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("云逸", 23333, 2005, 3, 7);
        staff[2] = new Employee("范增", 45600, 2018, 8, 9);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
