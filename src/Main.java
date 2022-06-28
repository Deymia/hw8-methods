import java.time.LocalDate;

public class Main {
//первое задание метод
    public static boolean checkYear (int a){

        boolean isLeap = false;
        if ( a % 4==0 && a % 100!=0 || a % 400 ==0){
            isLeap = true;
        } else {
            isLeap = false;
        }
        return isLeap;
    }

    public static void main(String[] args) {
//первое задание
        int year = 2005;
        checkYear(year);
        if (checkYear(year)==true) {
            System.out.println("Год " + year + "високосный");

        } if (!checkYear(year)) {
            System.out.println("Год " + year + " не високосный");

        }
// второе задание
        int syst = 0;
        int years = 2021;
        System.out.println(checkOSAndVersion(syst, years));

//третье задание
        int deliveryDistance = 15;
        System.out.println("Для доставки потребуется дней: " + checkDistance(deliveryDistance));



//второе задание метод
    }
    public static String checkOSAndVersion (int OS, int version){
        int currentYear = 2022;
        String announce = " ";

        if (OS==0){
            if (version < currentYear){
                announce = "установите облегченную версию IOS";

            } else if (version == currentYear){
                announce = "установите новую версию IOS";
            }
        }
        if (OS==1){
            if (version < currentYear){
                announce = "установите облегченную версию Android";

            } else if (version == currentYear){
                announce = "установите новую версию Android";
            }
        }

        return announce;

    }


//третье задание метод
    public static int checkDistance (int deliveryDist){

        int deliverySpeed = 0;

        if (deliveryDist <= 20) {
            deliverySpeed = 1;
        } else  if (deliveryDist > 20 && deliveryDist <=60) {
            deliverySpeed = 2;
        } else if (deliveryDist > 60 && deliveryDist <=100) {
            deliverySpeed = 3;
        }
        return deliverySpeed;

    }

}