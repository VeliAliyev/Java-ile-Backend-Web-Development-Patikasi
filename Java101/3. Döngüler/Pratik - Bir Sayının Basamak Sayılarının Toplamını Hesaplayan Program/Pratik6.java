import java.util.Scanner;
public class Pratik6 {

    public static void main(String[] args) {

        int number, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı : ");
        number = input.nextInt();

        while(number != 0)
        {
            sum += number % 10;
            number /= 10;
        }

        System.out.print("Toplam: " + sum);
    }
