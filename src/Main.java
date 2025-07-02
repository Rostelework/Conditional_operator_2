import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Task1");

        // Способ 1 (Числовой ввод)
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите число (0-для iOS систем, 1-для Android систем): ");
        int clientOS = scanner1.nextInt();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверное значение");
        }

        // Способ 2 (Числовой ввод c помощью логических переменных)
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите число (0-для iOS систем, 1-для Android систем: ");
        int clientSoftware = scanner2.nextInt();
        boolean iOS = clientSoftware == 0;
        if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Способ 3 (Строковый ввод)
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите название ОС (iOS или Android): ");
        String osName = scanner3.next();
        if (osName.equalsIgnoreCase("iOS")) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osName.equalsIgnoreCase("Android")) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Версия ПО для Вашего устройства не найдена");
        }

        System.out.println(" ");
        System.out.println("Task2");
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Введите число (0-для iOS систем, 1-для Android систем): ");
        int userOS = scanner4.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Укажите год создания Вашей операционной системы: ");
        int clientDeviceYear = scanner5.nextInt();
        if (userOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (userOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (userOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

        System.out.println(" ");
        System.out.println("Task3");
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner6.nextInt();
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является высокосным.");
        } else {
            System.out.println(year + " год не является высокосным.");
        }

        System.out.println(" ");
        System.out.println("Task4");
        Scanner scanner7 = new Scanner(System.in);
        System.out.print("Введите расстояние: ");
        int deliveryDistance = scanner7.nextInt();
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            days = 4;
        }
        if (days != 4) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println(" ");
        System.out.println("Task5");
        Scanner scanner8 = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner8.nextInt();
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
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}