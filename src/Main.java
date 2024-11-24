public class Main {
    public static void main(String[] args) {
        System.out.println("Home work-5");
        System.out.println();
        System.out.println("Задание №1");
        int clientOs = 1;
        if (clientOs < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задание-2");
        System.out.println("Вариант-1 спомощью условный переменных if and else");

        int clientDeviceYear = 2014;
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Вариант-2  с помощью boolean");

        boolean ios = clientOs != 1 && clientDeviceYear >= 2015;

        if (ios) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        }

        boolean android = clientOs == 1 && clientDeviceYear >= 2015;

        if (android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        boolean iosYear = clientOs != 1 && clientDeviceYear < 2015;

        if (iosYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        boolean androidYear = clientOs == 1 && clientDeviceYear <2015;

        if (androidYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }
}