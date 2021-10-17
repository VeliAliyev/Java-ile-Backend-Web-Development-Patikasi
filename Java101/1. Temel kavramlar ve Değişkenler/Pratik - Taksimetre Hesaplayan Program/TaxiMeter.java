import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {

        int startPrice = 10;
        double km, pricePerKm = 2.20, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter km: ");
        km = input.nextDouble();

        total = startPrice + km*pricePerKm;

        total = total < 20 ? 20: total;
        System.out.println("Total price: " + total);

    }
}
