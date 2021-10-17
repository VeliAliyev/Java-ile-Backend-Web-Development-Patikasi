import java.util.Scanner;

public class DesenRecursive {

        static int desen(int a){

            System.out.print(a + " ");
            if(a <= 0)
                return a;

            desen(a-5);
            System.out.print(a + " ");

            return a;
        }

        public static void main(String[] args) {

            int number;

            Scanner scan = new Scanner(System.in);
            System.out.print("N Sayısı : ");
            number = scan.nextInt();
            desen(number);
        }
    }
