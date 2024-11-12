public class ATM {
    private int PIN;
    private String location;
    private String bankName;

    public ATM(int PIN, String location, String bankName) {
        this.PIN = PIN;
        this.location = location;
        this.bankName = bankName;
    }

    public boolean validatePin(int pin) {
        return pin == this.PIN;
    }

    public String selectLanguage(String language) {
        return "Language selected: " + language;
    }

    public void displayOptions() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Mini Statement");
    }
}
