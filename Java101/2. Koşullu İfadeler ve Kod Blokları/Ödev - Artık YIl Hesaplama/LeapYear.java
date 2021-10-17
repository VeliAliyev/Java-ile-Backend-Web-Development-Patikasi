import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeap;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if(year % 100 == 0){

            if(year % 400 == 0)
                isLeap = true;
            else
                isLeap = false;
        }

        else if(year % 4 == 0)
            isLeap = true;

        else
            isLeap = false;

        if(isLeap)
            System.out.println(year + " bir artık yıldır !");
        else
            System.out.println(year + " bir artık yıl değildir !");
    }
}
