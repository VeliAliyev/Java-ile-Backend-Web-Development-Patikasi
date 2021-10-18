import java.util.Arrays;
import java.util.Scanner;
public class MaxMin {

    public static void main(String[] args) {
        int[] liste = {15,12,788,1,-1,-778,2,0};
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dizi : " + Arrays.toString(liste));
        System.out.print("Girilen Sayı : ");
        number = scan.nextInt();

        Arrays.sort(liste);
        System.out.println("Sorted: " + Arrays.toString(liste));
        for(int i = 0; i < liste.length; i++){
            if(number <= liste[i]){
                if(i!=0)
                    System.out.println("Girilen sayıdan küçük en yakın sayı : " + liste[i-1] );
                else
                    System.out.println("Girilen sayıdan küçük en yakın sayı : YOK" );

                if(number == liste[i])
                    if(i+1 != liste.length)
                        System.out.println("Girilen sayıdan büyük en yakın sayı : " + liste[i+1]);
                    else
                        System.out.println("Girilen sayıdan büyük en yakın sayı : YOK");
                else
                    System.out.println("Girilen sayıdan büyük en yakın sayı : " + liste[i]);

                break;
            }
            else if(i+1 == liste.length){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + liste[i] );
                System.out.println("Girilen sayıdan büyük en yakın sayı : YOK");
            }
            
        }
    }
}
