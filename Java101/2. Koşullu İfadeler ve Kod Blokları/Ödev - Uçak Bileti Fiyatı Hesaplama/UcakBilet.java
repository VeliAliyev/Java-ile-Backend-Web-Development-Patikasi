import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        int km, age, type;
        double price, pricePerKm = 0.10;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        price = km * pricePerKm;

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();

        if(km <= 0 || age <= 0 || (type != 1 && type != 2))
            isError = true;

        else if(age < 12){
            price *= 0.5;
        }
        else if(age >= 12 && age <= 24){
            price *= 0.9;
        }
        else if(age >= 65){
            price *= 0.7;
        }
        if(type == 2){
            price *= 0.8 * 2;
        }

        if (isError)
            System.out.println("Hatalı Veri Girdiniz !");
        else
            System.out.println("Toplam Tutar = " + price);

    }
}
