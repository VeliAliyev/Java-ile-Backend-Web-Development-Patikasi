import java.util.Scanner;
public class Pratik4 {
    public static void main(String[] args) {
        long n,r, nF = 1,rF = 1, nrF = 1, combination ;

        System.out.println("C(n,r) = n! / (r! * (n-r)!)");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = input.nextInt();
        System.out.print("Enter r: ");
        r = input.nextInt();

        for(int i = 1; i <= n; i++)
                nF *=i;

        for(int i = 1; i <= r; i++)
            rF *=i;

        for(int i = 1; i <= n-r; i++)
            nrF *=i;

        combination = nF/(rF*nrF);
        System.out.print("C("+n+","+r+") = " + combination);
    }
}
