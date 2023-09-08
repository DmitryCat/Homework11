import java.time.Year;

public class Main {
    public static void testOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void testYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }
    public static void waitCard(int deliveryDistance) {
        int day=0;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней доставки: " + (day+1));
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней доставки: " + (day+2));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней доставки: " + (day+3));
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void main(String[] args) {
        // Задание 1
        int year = 1400;
        testYear(year);
        // Задание 2
        int clientsOS = 0;
        int clientDeviceYear = 2022;
        testOS(clientsOS, clientDeviceYear);
        // Задание 3
        int deliveryDistance = 5;
        waitCard(deliveryDistance);
    }
}
