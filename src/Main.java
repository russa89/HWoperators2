public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");

    int clientOs = 1;
    if (clientOs == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOs == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
        System.out.println("\nЗадание 2");
    int clientDeviceYear = 2015;
    if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    if (clientOs == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
        System.out.println("\nЗадание 3");


    }

    }
}
