//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            int clientOS = 0;
            {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            {
            }
            int clientDeviceYear = 2014;
            if (clientDeviceYear >= 2015 && clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientDeviceYear >= 2015 && clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            if (clientDeviceYear < 2015 && clientOS == 0) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }
            if (clientDeviceYear < 2015 && clientOS == 1) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }
            {
            }
        }
        int year = 2021;
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;

        if (leap)
            System.out.println("Этот год високосный");
        else
            System.out.println("Этот год не високосный");
        {
        }
        int deliveryDistance = 95;
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Доставки нет для расстояния свыше 100 км.");
            return;
            }
        System.out.println("Потребуется дней: " + deliveryDays);
            {
            }
        int monthNumber = 12;
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Некорректный номер месяца. Номер месяца должен быть от 1 до 12.");
            return;
        }

        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "неизвестно";
                break;
        }

        System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону " + season + ".");
    }
}


