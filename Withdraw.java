public class Withdraw extends Transaction {
    private int amount;
    private String accountNumber;

    public Withdraw(String date, String type, int amount, String accountNumber) {
        super(date, type, amount);
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return amount;
    }
}