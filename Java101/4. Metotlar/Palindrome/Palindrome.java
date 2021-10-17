import java.util.Scanner;
public class Palindrome {

    static boolean isPalindrome(int number){

        int temp = number, lastDigit, reverseNumber = 0;

        while(temp !=0){
            lastDigit = temp % 10;
            reverseNumber = reverseNumber*10 + lastDigit;
            temp /= 10;
        }
        if(reverseNumber == number)
            return true;
        else
            return  false;
    }

    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

            if (isPalindrome(number))
                System.out.print(number + " -" + " Palindrome sayı");
            else
                System.out.print(number + " -" + " Palindrome sayı değil");
    }
}
