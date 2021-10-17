import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {

        int n1 = 0,n2 = 1,number, temp ;
        Scanner input = new Scanner(System.in);


            System.out.print("Eleman sayısını giriniz: ");
            number = input.nextInt();

            for(int i = 0; i < number; i++){

                if(i == 0){
                    System.out.print(0 + " ");
                    continue;
                }
                else  if(i == 1){
                    System.out.print(1 + " ");
                    continue;
                }

                System.out.print((n1 + n2) + " ");
                temp = n1 + n2;
                n1 = n2;
                n2 = temp;
            }
    }
}
