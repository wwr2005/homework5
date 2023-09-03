public class Main {
    public static void main(String[] args) {

        int clientAndroid = 0;
        if (clientAndroid == 1) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientAndroid == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int clientIOS = 1;
        int clientDeviceYear = 2013;
        if (clientIOS == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите обычную версию приложения для IOS по ссылке ");
        } else if (clientIOS == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientIOS == 0 && clientDeviceYear >= 2015) {
         System.out.println(" Установите обычную версию приложения для Android по ссылке ");
        } else if (clientIOS == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        }

        int year = 2023;
        if (year > 1584 && year % 4 == 0 && year % 100 == 0 || year % 400 != 0) {
            System.out.println( year + " год является високосным ");
        } else {
            System.out.println( year + " год не является високосным ");
        }
int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance > 100) {
            System.out.println(" доставки нет ");
        } else {
            if (deliveryDistance > 20) {
                day++;
            }
            if (deliveryDistance > 60) {
                day++;
            }
            System.out.println(" Потребуется дней " + day);
        }
int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println(" Зима ");
                break;
            case 3, 4, 5:
                System.out.println(" Весна ");
                break;
            case 6, 7, 8:
                System.out.println(" Лето ");
                break;
            case 9, 10, 11:
                System.out.println(" Осень ");
                break;
            default:
                System.out.println(" Неправельный месяц ");
        }
    }
}