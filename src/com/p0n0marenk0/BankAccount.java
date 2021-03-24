package com.p0n0marenk0;

    public class BankAccount {

        private String name;
        private double count;

        public BankAccount(String name, double count) {
            this.name = name;
            this.count = count;
        }

        // 0.5% commission
        public void add(double money) {
            //count += 99.5
        }

        // 1% commission
        public void transfer(BankAccount otherPerson, double money){

        }
    }

