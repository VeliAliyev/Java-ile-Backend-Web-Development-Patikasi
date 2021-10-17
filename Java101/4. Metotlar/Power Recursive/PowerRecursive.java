import java.util.Scanner;

public class PowerRecursive {

    static int power(int a, int b){

        if(b == 0) return 1;
        else return a * power(a, b - 1);
    }

    public static void main(String[] args) {

        int a, b, result;

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        a = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        b = scan.nextInt();
        result = power(a, b);
        System.out.print("Sonuç: " + result);
    }
}
