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
    }
}