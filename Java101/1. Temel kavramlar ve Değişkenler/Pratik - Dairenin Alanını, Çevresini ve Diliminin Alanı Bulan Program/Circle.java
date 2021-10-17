import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        double radius, area, perimeter, pi = 3.14, sectorArea, alfa;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        System.out.print("Enter central angle: ");
        alfa = input.nextDouble();

        area = Math.round(10000d*(pi*radius*radius))/10000d;
        perimeter = Math.round(10000d*(2*pi*radius))/10000d;
        sectorArea = Math.round(10000d*((alfa/360)*pi*radius*radius))/10000d;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.print("Sector area: " + sectorArea);

    }
}
