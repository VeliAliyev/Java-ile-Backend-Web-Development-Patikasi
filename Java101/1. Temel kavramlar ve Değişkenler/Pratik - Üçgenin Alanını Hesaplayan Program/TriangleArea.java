import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double a,b,c,u,area;

        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        a = input.nextDouble();

        System.out.print("b: ");
        b = input.nextDouble();

        System.out.print("c: ");
        c = input.nextDouble();

        u = (a+b+c)/2;

        area = Math.sqrt( u * (u - a) * (u - b) * (u - c));
        System.out.println("Area: " + area);

    }
}
