package bank;

public class BankAccount {
    private String owner;
    private AccountType accountType;
    private double balance;

    public static final double COMISSION = 1.2;

    public BankAccount(String owner, AccountType accountType, double balance) {
        this.owner = owner;
        this.accountType = accountType;
        this.balance = balance;
    }

    public BankAccount(String owner, double balance) {
       this(owner, AccountType.SAVING, 0);
    }

    public BankAccount(){
        this("", AccountType.SAVING, 0);
    }

    void takeMoney(double amount) {
        if(amount < 0 ) {
            return;
        }
        double comission = calculateComission();
        balance -= amount;
        balance -= comission;
    }

    double calculateComission() {
        switch (accountType) {
            case SAVING:
                return COMISSION;
            default:
                return 0;
        }
    }

    void uploadMoney(double amount) {
        balance += amount;
    }

    void changeTypeAcc() {
        accountType = AccountType.SAVING;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
