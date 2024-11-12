public class Main {
    public static void main(String[] args) {
        // Create instances and test the functionality
        ATM atm = new ATM(1234, "Main Street", "MyBank");
        Bank bank = new Bank("MyBank", "Main Street");
        Customer customer = new Customer("John Doe", 1234567890, "john@example.com", "john123");
        Account account = new Account("123456789", "MyBank", 1000);
        Transaction transaction = new Transaction("2024-11-12", "Deposit", 500);
        Withdraw withdraw = new Withdraw("2024-11-12", "Withdraw", 200, "123456789");
        Deposit deposit = new Deposit("2024-11-12", "Deposit", 300, "123456789");
        MiniStatement miniStatement = new MiniStatement("123456789");

        // Example usage
        if (atm.validatePin(1234)) {
            atm.selectLanguage("English");
            atm.displayOptions();
        }

        customer.selectOptions("Withdraw");
        customer.updateInformation("john.doe@example.com");
        customer.depositOrWithdraw(500);

        account.accountSelection("Savings");
        account.cashWithdraw(200);
        account.cashDeposit(300);
        System.out.println(account.miniStatement());

        transaction.printReceipt();
        withdraw.getBalance();
        deposit.getBalance();
        miniStatement.getBalance(account.getBalance());
    }
}
