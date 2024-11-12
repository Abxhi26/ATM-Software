public class Customer {
    private String name;
    private int phoneNumber;
    private String emailId;
    private String userId;

    public Customer(String name, int phoneNumber, String emailId, String userId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.userId = userId;
    }

    public void selectOptions(String options) {
        System.out.println("Option selected: " + options);
    }

    public void updateInformation(String info) {
        System.out.println("Information updated: " + info);
    }

    public void depositOrWithdraw(int amount) {
        System.out.println("Amount to deposit/withdraw: " + amount);
    }
}
