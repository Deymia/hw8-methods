import java.time.LocalDate;

public class Main {
//первое задание
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
//все еще первое задание
        int year = 2005;
        checkYear(year);
        if (checkYear(year)==true) {
            System.out.println("Год " + year + "високосный");

        } if (!checkYear(year)) {
            System.out.println("Год " + year + " не високосный");

        }
//второе задание

    }
    public static boolean checkOSAndVersion (int a, int b ){
        int OS = 0;
        int version = 2015;
        int currentYear = LocalDate.now().getYear();
        if (OS==0 && version < currentYear){

        }

    }
}