public class Account {
    private String accountNumber;
    private String bankName;
    private int balance;

    public Account(String accountNumber, String bankName, int balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public String accountSelection(String selection) {
        return "Account selected: " + selection;
    }

    public int cashWithdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return amount;
        }
        System.out.println("Insufficient balance.");
        return 0;
    }

    public void cashDeposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public String miniStatement() {
        return "Mini Statement: Balance = " + balance;
    }

    public int getBalance() {
        return balance;
    }
}
