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
        boolean androidYear = clientOs == 1 && clientDeviceYear < 2015;

        if (androidYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задание-3");
        int year = 2024;
        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)) && year > 1584) {

            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        System.out.println();
        System.out.println("Задание-4");
        int deliveryDistance = 20;
        int distanceYear = 24;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (deliveryDistance <= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется день и " + distanceYear + " часа");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется два дня и " + distanceYear + "часа");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
        System.out.println("Задание-5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default: {
                System.out.println("Такого месяца и времени года нет");
            }
        }

    }
}