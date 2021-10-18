import java.util.*;

public class Main {

    public static void main(String[] args) {
        int row,col;

        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        System.out.println("Tarla boyutunu giriniz (m x n):");
        while(true) {
            System.out.print("m : ");
            row = scan.nextInt();
            System.out.print("n : ");
            col = scan.nextInt();
            if(row*col >= 4)
                break;
            else
                System.out.println("Matris boyutu 4'ten küçük olamaz!");
        }

        MineSweeper mine = new MineSweeper(row,col);
        mine.run();
    }
}
