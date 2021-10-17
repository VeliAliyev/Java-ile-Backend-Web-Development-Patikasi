import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName = "patika", password = "java123", userNameInput, passwordInput;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı: ");
        userNameInput = input.nextLine();

        System.out.print("Şifreniz: ");
        passwordInput = input.nextLine();

        if(userNameInput.equals(userName) && passwordInput.equals(password)){
            System.out.print("Giriş yaptınız!");
        }
        else if(!passwordInput.equals(password))
        {
            System.out.println("Şifre yanlış. Yeni şifre oluşturmak ister misiniz?(y[YES]/n[NO]): ");
            if(input.nextLine().equals("y")){
                System.out.print("Yeni şifreniz: ");
                passwordInput = input.nextLine();

                if(passwordInput.equals(password)){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                    passwordInput = input.nextLine();
                }
                if(!passwordInput.equals(password))
                    System.out.print("Şifre oluşturuldu");
            }
        }
    }
}
