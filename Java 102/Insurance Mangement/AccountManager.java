import java.util.TreeSet;

public class AccountManager {

    TreeSet<Account> accounts;

    public AccountManager() {
        this.accounts = new TreeSet<>();
    }

    public Account login(String email, String password){
        for(Account account : this.accounts){
            if(account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)){

                try {
                    account.login(email,password);
                } catch (InvalidAuthenticationException e) {
                    e.printStackTrace();
                }
                return account;
            }
        }
        return null;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }
}
