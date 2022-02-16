import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Login Information : ");
        System.out.print("E-mail : ");
        String email = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();

        User user1 = new User("Example", "Exampleoğlu", "example@example.com", "Example1234", "Software Developer", 26, Calendar.getInstance().getTime());
        Individual individual_account = new Individual(user1);
        accountManager.addAccount(individual_account);
        Account account = accountManager.login(email,password);
        if(account != null)
            account.showUserInfo();


    }
}
