import java.util.*;

public class PalindromeString {

    static boolean isPalindrome(String str){

        StringBuilder string = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        string.append(str);
        reverse.append(str);

        reverse.reverse();

        if(string.compareTo(reverse) == 0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        String str = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter q to quit the program\n");

        while(true) {

            System.out.print("Enter string : ");
            str = scanner.nextLine();

            if(str.equals("q"))
                break;

            if (isPalindrome(str))
                System.out.println("This is a palindrome string.");
            else System.out.println("This is not a palindrome string");
        }
    }
}
