import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, counter = 0;
        double average = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if(mat>=0 && mat<=100) {
            counter++;
            average += mat;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if(fizik>=0 && fizik<=100) {
            counter++;
            average += fizik;
        }
        System.out.print("Turkçe notunuz: ");
        turkce = input.nextInt();
        if(turkce>=0 && turkce<=100) {
            counter++;
            average += turkce;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if(kimya>=0 && kimya<=100) {
            counter++;
            average += kimya;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if(muzik>=0 && muzik<=100) {
            counter++;
            average += muzik;
        }

        average /= counter;
        System.out.println("Ortalama: " + average);
        if(average >= 55)
            System.out.println("Geçti");
        else
            System.out.println("Kaldı");

    }



}
