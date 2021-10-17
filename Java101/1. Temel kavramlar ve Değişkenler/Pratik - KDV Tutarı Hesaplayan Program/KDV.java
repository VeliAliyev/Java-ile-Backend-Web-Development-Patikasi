import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        double fiyat, kdvOrani, kdvTutari, kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("KDV'siz fiyat giriniz: ");
        fiyat = input.nextFloat();

        kdvOrani = fiyat>0 && fiyat<=1000 ? 0.18: 0.08;

        kdvTutari = fiyat * kdvOrani;
        kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz fiyat: " + fiyat);
        System.out.println("KDV oranı: " + "%" + kdvOrani*100);
        System.out.println("KDV tutarı: " + kdvTutari);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
    }
}
