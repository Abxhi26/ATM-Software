public class Bank {
    private String bankName;
    private String location;

    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
    }

    public void authorizeAccount(String accountNumber) {
        System.out.println("Account " + accountNumber + " authorized.");
    }

    public void manageTransaction(Transaction transaction) {
        System.out.println("Managing transaction of type: " + transaction.getType());
    }
}
