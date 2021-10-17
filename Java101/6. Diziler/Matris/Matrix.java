import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        int m, n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matris boyutunu giriniz(mxn) : ");
        System.out.print("m : ");
        m = scan.nextInt();
        System.out.print("n : ");
        n = scan.nextInt();

        int[][] matris = new int[m][n];
        int[][] transpose = new int[n][m];
        System.out.println("Matris giriniz : ");
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                matris[i][j] = scan.nextInt();

        System.out.println("Matris : ");
        for(int[] i : matris){
            for(int j : i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matris[i][j];
            }
        }

        System.out.println("Transpose : ");
        for(int[] i : transpose){
            for(int j : i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }
}
