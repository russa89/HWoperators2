public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("\nЗадание 2");
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("\nЗадание 3");
        int year = 2021;
        if (year >= 1584 && (year%4 == 0 && year%100 != 0) || year%400 == 0) {
            System.out.println(year + " год является високосным!");
        } else System.out.println(year + " год не является високосным!");

        System.out.println("\nЗадание 4");

    }

}