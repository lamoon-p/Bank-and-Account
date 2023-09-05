public class Main {

    public static void main(String[] args) {

        // create account
        Account account1 = new Account("Top", 123456789123L, 500);
        Account account2 = new Account("Nan", 987654321987L, 1000);
        Account account3 = new Account(null,  488545328879L, 800);

        // add to collection
        Bank.addAccount(account1);
        Bank.addAccount(account2);
        Bank.addAccount(account3);
        for (Account account: Bank.getAccountCollection()) {
            System.out.println(account);
        }

        // deposit money
        Bank.deposit(account1, 2000);
        Bank.deposit(account2, 40000000);


        // withdraw money
        Bank.withdraw(account1, 3000);
        Bank.withdraw(account1, 300);
        Bank.withdraw(account2, 2000000);

        // remove from collection
        Bank.removeAccount(account1);
        Bank.removeAccount(account2);
        Bank.removeAccount(account3);
    }
}
