package com.p0n0marenk0;

public class Main {

    public static void main(String[] args) {

        BankAccount boss = new BankAccount("Oleg", 0);
        BankAccount ivan = new BankAccount("Ivan", 0);
        BankAccount alex = new BankAccount("Alex", 0);
        BankAccount sergey = new BankAccount("Sergey", 0);

        boss.add(100000);
        System.out.println(boss.getCount());
        boss.add(300000);
        System.out.println(boss.getCount());


        boss.transfer(ivan, 9000);
        boss.transfer(alex, 15000);
        boss.transfer(sergey, 20000);
        System.out.println(ivan.getName() + ": " + ivan.getCount());
        System.out.println(alex.getName() + ": " + alex.getCount());
        System.out.println(sergey.getName() + ": " + sergey.getCount());
        System.out.println(boss.getName() + ": " + boss.getCount());
    }
}
