public class Account {

    // attributes go here
    private String accountOwnerName;
    private final long accountNumber;
    private double amount;

    // maintain account details of a particular customer
    public Account(String accountOwnerName, long accountNumber, double amount) {

        setAccountOwnerName(accountOwnerName);
        this.accountNumber = accountNumber;
        if (amount >= 0 ) {
            setAmount(amount);
        } else {
            System.out.println("Initial amount to create account must be positive");
        }
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {

        if (accountOwnerName != null && accountOwnerName.matches("^[a-zA-Z]+$")) {
            this.accountOwnerName = accountOwnerName;
        } else {

            // I want to remove/delete wrong input account.
            System.out.println("Given account owner name is not a proper name.");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountOwnerName='" + accountOwnerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                '}';
    }
}
