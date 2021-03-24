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
            count += money-money*0.5/100;
        }

        // 1% commission
        public void transfer(BankAccount otherPerson, double money){
            if (count >= money ){
                count = count - money;
            }else{
                System.out.println(otherPerson.getName() + " Ой, давайте завтра рассчитаюсь)");
            }
            otherPerson.count += money-money*1/100;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCount() {
            return count;
        }

        public void setCount(double count) {
            this.count = count;
        }
    }

