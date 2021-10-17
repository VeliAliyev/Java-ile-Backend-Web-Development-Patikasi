import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int number, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        for(int i = 1; i < number; i++){

            if(number % i == 0)
                sum += i;
        }

        if(sum == number)
            System.out.print(number + " Mükemmel sayıdır");
        else
            System.out.print(number + " Mükemmel sayı değildir.");
    }
}
