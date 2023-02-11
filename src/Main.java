import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        task6();
        task7();
    }

    public static void task6() {
        System.out.println("");
        System.out.println("Задача №6");
        int age = 36;
        int salary = 250000;
        double creditLimit = 0;
        if (age >= 23) {
            if (salary < 50000) {
                creditLimit = salary * 3;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
            } else if (salary >= 50000 && salary < 80000) {
                creditLimit = salary * 3 * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
            } else {
                creditLimit = salary * 3 * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
            }
        } else {
            if (salary < 50000) {
                creditLimit = salary * 2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
            } else if (salary >= 50000 && salary < 80000) {
                creditLimit = salary * 2 * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
            } else {
                creditLimit = salary * 2 * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("");
        System.out.println("Задача №7");
        int age = 25;
        int salary = 60000;
        int wantedSum = 330000;
        double maxPayment = 0;
        double payment = 0;
        double percent = 0;
        if (age < 23) {
            if (salary > 80000) {
                maxPayment = salary * 0.5;
                percent = (0.1 + 0.01 - 0.007)/12;
                payment = wantedSum * (percent * Math.pow(1 + percent, 12) / (Math.pow(1 + percent, 12) - 1));
                BigDecimal bd = new BigDecimal(payment);
                if (maxPayment < payment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Отказано");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Одобрено");
                }
            } else {
                maxPayment = salary * 0.5;
                percent = (0.1 + 0.01)/12;
                payment = wantedSum * (percent * Math.pow(1 + percent, 12) / (Math.pow(1 + percent, 12) - 1));
                BigDecimal bd = new BigDecimal(payment);
                if (maxPayment < payment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Отказано");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Одобрено");
                }
            }
        } else if (age >= 23 && age < 30) {
            if (salary > 80000) {
                maxPayment = salary * 0.5;
                percent = (0.1 + 0.005 - 0.007)/12;
                payment = wantedSum * (percent * Math.pow(1 + percent, 12) / (Math.pow(1 + percent, 12) - 1));
                BigDecimal bd = new BigDecimal(payment);
                if (maxPayment < payment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Отказано");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Одобрено");
                }
            } else {
                maxPayment = salary * 0.5;
                percent = (0.1 + 0.005) / 12;
                payment = wantedSum * (percent * Math.pow(1 + percent, 12) / (Math.pow(1 + percent, 12) - 1));
                BigDecimal bd = new BigDecimal(payment);
                if (maxPayment < payment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Отказано");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Одобрено");
                }
            }
        } else {
            if (salary > 80000) {
                maxPayment = salary * 0.5;
                percent = (0.1 - 0.007)/12;
                payment = wantedSum * (percent * Math.pow(1 + percent, 12) / (Math.pow(1 + percent, 12) - 1));
                BigDecimal bd = new BigDecimal(payment);
                if (maxPayment < payment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Отказано");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Одобрено");
                }
            } else {
                maxPayment = salary * 0.5;
                percent = 0.1/12;
                payment = wantedSum * (percent * Math.pow(1 + percent, 12) / (Math.pow(1 + percent, 12) - 1));
                BigDecimal bd = new BigDecimal(payment);
                if (maxPayment < payment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Отказано");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                            "Платеж по кредиту " + bd.setScale(2, RoundingMode.HALF_UP) + " рублей. Одобрено");
                }
            }
        }
    }
}