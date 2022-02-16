import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {

    User user;
    ArrayList<Insurance> insurances;
    AuthenticationStatus authenticationStatus;
    public final void showUserInfo(){

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-25s | %-30s | %-30s | %-3s | %-30s | %-30s | %n",
                "Full Name", "Email", "Occupation", "Age", "Address", "Last Login");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-25s | %-30s | %-30s | %-3s | %-30s | %-30s | %n",
                this.user.getName() + " " + this.user.getSurname(), this.user.getEmail(), this.user.getOccupation(),
                this.user.getAge(), " " ,this.user.getDate());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void login (String email, String password) throws InvalidAuthenticationException{

        if(this.user.getEmail().equals(email) && this.user.getPassword().equals(password)){
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        }
        else{
            this.authenticationStatus = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid username and password!");
        }

    }

    public AuthenticationStatus status(){
        return this.authenticationStatus;
    }

    public abstract void addInsurance(Insurance insurance);

    public User getUser() {
        return user;
    }

    @Override
    public int compareTo(Account a) {
        return this.hashCode() - a.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return user.equals(account.user) && Objects.equals(insurances, account.insurances) && authenticationStatus == account.authenticationStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, insurances, authenticationStatus);
    }
}
