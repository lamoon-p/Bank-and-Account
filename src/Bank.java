import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static List<Account> accounts = new ArrayList<>();

    public static void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added!");
    }

    public static void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Account removed!");
    }

    public static void deposit(Account account, double depositAmount) {

        double accumulation = account.getAmount() + depositAmount;
        account.setAmount(accumulation);

        System.out.println(depositAmount + " Gold deposit into " + account.getAccountOwnerName() + "'s account");
        System.out.println("Money in your account updated to " + account.getAmount() + " Gold");
    }

    public static void withdraw(Account account, int withdrawAmount) {

        double accumulation = account.getAmount() - withdrawAmount;
        if (accumulation >= 0) {
            account.setAmount(accumulation);
            System.out.println(withdrawAmount + " Gold withdraw from " + account.getAccountOwnerName() + "'s account");
            System.out.println("Money in your account updated to " + account.getAmount() + " Gold");

        } else {
            System.out.println("Insufficient Money");
        }
    }

    public static List<Account> getAccountCollection() {
        return accounts;
    }

}
