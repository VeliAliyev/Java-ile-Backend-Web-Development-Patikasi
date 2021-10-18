import java.util.Scanner;

public class AdvancedCalculator {
    static void plus(int a, int b) {

        System.out.println("Sonuç : " + (a + b));
    }

    static void minus(int a, int b) {

        System.out.println("Sonuç : " + (a - b));
    }


    static void product(int a, int b) {

        System.out.println("Sonuç : " + (a * b));
    }

    static void divided(double a, double b) {

        if(b == 0) System.out.println("HATA!: Bölen 0 olamaz...");

        else System.out.println("Sonuç : " + (a / b));
    }

    static void power(int a, int b) {

        int result = 1;

        for(int i = 1; i <= b; i++)
            result *=a;

        System.out.println("Sonuç : " + result);
    }

    static void factorial(int a) {

        int result = 1;

        for (int i = 1; i <= a; i++)
            result *= i;

        System.out.println("Sonuç : " + result);
    }

    static void mod(int a, int b){

        System.out.println("Sonuç : " + (a % b));
    }

    static  void areaAndPerimeter(int a, int b ){

        System.out.println("Çevre : " + 2*(a + b));
        System.out.println("Alan : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select = 0,a = 0,b = 0;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);

        while(true)
        {
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();

            if(select == 0) break;

            if(select != 6){
                System.out.print("1. sayı: ");
                a = scan.nextInt();
                System.out.print("2. sayı: ");
                b = scan.nextInt();
            }
            else {
                System.out.print("sayı: ");
                a = scan.nextInt();
            }

            switch (select) {
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    product(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    areaAndPerimeter(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
    }
}
