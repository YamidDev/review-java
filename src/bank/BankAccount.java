package bank;

public class BankAccount {
    String owner;
    String accountType;
    double balance;

    BankAccount(String owner, String accountType, double balance) {
        this.owner = owner;
        this.accountType = accountType;
        this.balance = balance;
    }

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.accountType = "ahorro";
        this.balance = balance;
    }

    void takeMoney(double amount) {
        if(amount < 0 ) {
            return;
        }
        balance -= amount;
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
