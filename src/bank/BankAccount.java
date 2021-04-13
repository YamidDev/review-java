package bank;

public class BankAccount {
    String owner;
    String accountType;
    double balance;

    public static final String SAVING_TYPE = "Ahorros";
    public static final String PAYROLL_TYPE = "Nomina";
    public static final String CREDIT_TYPE = "Credito";
    public static final double COMISSION = 1.2;

    BankAccount(String owner, String accountType, double balance) {
        this.owner = owner;
        this.accountType = accountType;
        this.balance = balance;
    }

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.accountType = SAVING_TYPE;
        this.balance = balance;
    }

    void takeMoney(double amount) {
        if(amount < 0 ) {
            return;
        }
        double comission = 0.0;
        if(accountType.equals(SAVING_TYPE)) {
            comission = COMISSION;
        }
        balance -= amount;
        balance -= comission;
    }

    void uploadMoney(double amount) {
        balance += amount;
    }

    void changeTypeAcc(String newType) {
        accountType = newType;
    }

    double getBalance() {
        return balance;
    }

    String getAccountType() {
        return accountType;
    }

}
