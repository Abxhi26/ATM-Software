public class MiniStatement {
    private String accountNumber;

    public MiniStatement(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void getBalance(int balance) {
        System.out.println("Mini Statement Balance: " + balance);
    }
}