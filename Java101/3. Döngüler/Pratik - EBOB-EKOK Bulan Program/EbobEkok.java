import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int ebob = 0, ekok = 0, n1, n2, min;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();

        if (n2 < n1)
            min = n2;
        else
            min = n1;

        while( min > 0){

            if(n1 % min == 0 && n2 % min == 0){
                ebob = min;
                break;
            }
            min--;
        }
        ekok = (n1*n2)/ebob;
        System.out.println("EBOB: " + ebob);
        System.out.print("EKOK: " + ekok);
    }
}
