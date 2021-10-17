import java.util.Scanner;
public class Pratik1 {

    public static void main(String[] args) {

        int number = 0, counter = 0;
        double avg = 0;

        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        for(int i = 1; i <= number; i++)
        {
            if(i % 3 == 0 || i % 4 == 0){
                avg += i;
                counter++;
            }
            else continue;
        }
        if(counter > 0)
            avg /= counter;
        System.out.print("Ortalama : " + avg);
    }

}
