import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        System.out.println("Guess The Number Game");
        System.out.println("Rules: ");
        System.out.println("1. You have 5 tries to guess the number");
        System.out.println("2. Enter a number between 0 and 100");

        Random rnd = new Random();
        int random, guess, tries = 5;
        random = rnd.nextInt(100);
        Scanner scan = new Scanner(System.in);

        while(tries > 0){

            System.out.print("Enter your number : ");
            guess = scan.nextInt();

            if(guess == random){
                System.out.println("Congratulations! You guessed the number : " + guess);
                break;
            }
            else{
                tries--;
                if(tries == 0){
                    System.out.println("Sorry, you lost!");
                    System.out.println("The number was : " + random);
                    break;
                }
                if(guess < 0 || guess > 100){
                    System.out.println("Enter a number between 0 and 100");
                }
                if(guess < random)
                    System.out.println("Your guess is less than my number!");

                else System.out.println("Your guess is bigger than my number!");
                System.out.println("Tries left : " + tries);
            }
        }
    }
}
