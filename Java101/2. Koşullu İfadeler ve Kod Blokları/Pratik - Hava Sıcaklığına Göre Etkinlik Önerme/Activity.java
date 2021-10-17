import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        temperature = input.nextInt();

        if(temperature < 5)
            System.out.println("Kayak yapabilirsin");

        if(temperature >= 5 && temperature <= 15)
            System.out.println("Sinemaya gidebilirsin");

        if(temperature > 10 && temperature <= 25)
            System.out.println("Pikniğe gidebilirsin");

        else if(temperature > 25)
            System.out.println("Yüzmeye gidebilirsin");
    }
}
