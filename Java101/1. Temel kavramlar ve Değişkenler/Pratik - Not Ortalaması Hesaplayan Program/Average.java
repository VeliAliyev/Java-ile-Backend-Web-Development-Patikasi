import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.println("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        float ortalama = (mat+turkce+fizik+kimya+tarih+muzik)/6;
        System.out.println("Ortalama not: " + ortalama);

        String status = ortalama >= 60 ? "Geçti" : "Kaldı";
        System.out.println(status);

    }
}
