import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arraySize;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        arraySize = scan.nextInt();
        int[] arr = new int [arraySize];
        System.out.println("Dizinin elemanlarını giriniz :");

        for (int i = 0; i < arraySize; i++){
            System.out.print(i+1 + ". Elemanı : ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sıralama : ");
        for(int number : arr)
            System.out.print(number + " ");
    }
}
