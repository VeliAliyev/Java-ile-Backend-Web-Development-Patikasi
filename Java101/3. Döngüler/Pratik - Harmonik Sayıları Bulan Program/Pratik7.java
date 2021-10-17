import java.util.Scanner;
public class Pratik7 {
    public static void main(String[] args) {

        int N, i = 1;
        double sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        N = input.nextInt();

        while(i <= N){

            sum += 1.0/i;
            i++;
        }
        System.out.print(sum);
    }
}
