import java.util.Scanner;
public class Pratik5 {
    public static void main(String[] args) {
        int n,r, power = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        r = input.nextInt();

        for(int i = 1; i <= r; i++)
            power *=n;
        System.out.print("Cevap: " + power);
    }
}
