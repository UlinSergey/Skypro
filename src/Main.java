import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        isLeapYear(2000);
        isLeapYear(1900);
        isLeapYear(1899);
        isLeapYear(1800);
        isLeapYear(2021);

        defineAppVersion(0,2023);
        defineAppVersion(1,2020);

        int deliveryDistance=95;
        printCardDeliveryDays(deliveryDistance);
        printCardDeliveryDays(10);
        printCardDeliveryDays(1000);
    }
    public static void isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " - Високосный год");
        } else {
            System.out.println(year + " - Невисокосный год");
        }
    }

    public static void defineAppVersion (int mobilesOs,int mobileYers) {
        String mobileOsName;
        switch (mobilesOs) {
            case 0:
                mobileOsName = "iOS";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "неизвестное ОС";
        }
        int currntYers = LocalDate.now().getYear();
        if (mobileYers != currntYers) {
            System.out.println("Для ОС " + mobileOsName + " установите lite-версию");
        } else {
            System.out.println("Для ОС " + mobileOsName + " установите обычную версию");
        }
    }
    public static void printCardDeliveryDays (int distance){
        int days= calcDeliveryDays(distance);
        if (days>0){
            System.out.println("Потрубуеться дней: "+ days);
        }else {
            System.out.println("Доставув не осуществляеться");
        }
    }
    public static int calcDeliveryDays (int distance){
        if (distance<=20){
            return 1;
        }else if (distance<=60){
            return 2;
        } else if (distance <= 100) {
            return 3;
        }else {
            return -1;
        }
    }
}
