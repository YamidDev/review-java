package bank;

public class BankAccount {
    String owner;
    AccountType accountType;
    double balance;

    public static final double COMISSION = 1.2;

    BankAccount(String owner, AccountType accountType, double balance) {
        this.owner = owner;
        this.accountType = accountType;
        this.balance = balance;
    }

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.accountType = AccountType.SAVING;
        this.balance = balance;
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

    void changeTypeAcc(String newType) {
        accountType = AccountType.SAVING;
    }

    double getBalance() {
        return balance;
    }

}
