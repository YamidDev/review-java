package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount juanAccount = new BankAccount();

        juanAccount.owner = "Juan Martinez";
        juanAccount.accountType = "Nomina";
        juanAccount.balance = 23_500;

        System.out.println("Cual es el saldo de la cuenta de juan: " + juanAccount.balance);

    }
}
