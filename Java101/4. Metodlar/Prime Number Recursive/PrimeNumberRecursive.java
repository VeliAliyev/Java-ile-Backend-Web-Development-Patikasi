import java.util.Scanner;

public class PrimeNumberRecursive {
    static boolean isPrime(int a, int b){

        if( a == 1)
            return false;

        if(b == 1)
            return true;

        if(a % b == 0)
            return false;

        else
            return isPrime(a,b-1);
    }

    public static void main(String[] args) {

        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        a = scan.nextInt();
        if(a <= 0)
            System.out.println("HATA!: Pozitif sayılar giriniz");

        else if(isPrime(a, a-1))
            System.out.print(a + " sayısı ASALDIR !");
        else
            System.out.print(a + " sayısı ASAL değildir !");
    }
}
