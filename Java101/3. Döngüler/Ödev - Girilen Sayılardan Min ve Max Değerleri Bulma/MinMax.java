import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int number, max = 0,min = 0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        for(int i = 1; i <= number; i++){

            System.out.print(i+". Sayıyı giriniz: ");
            int temp = input.nextInt();

            if(temp > max)
                max = temp;
            else if(temp < min)
                min = temp;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
