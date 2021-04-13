package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount juanAccount = new BankAccount("Juan Martinez", "Nomina", 23_500);

        juanAccount.takeMoney(500);

        System.out.println("juanAccount balance = " + juanAccount.getBalance());

        juanAccount.uploadMoney(100);
        System.out.println("juanAccount balance = " + juanAccount.getBalance());

        juanAccount.accountType = "Ahorros";
        System.out.println("juanAccount accountType = " + juanAccount.getAccountType());
        juanAccount.takeMoney(-1000);
        System.out.println(juanAccount.getBalance());

    }
}
