package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount juanAccount = new BankAccount("Juan Martinez", AccountType.PAYROLL, 23_500);

        juanAccount.takeMoney(500);

        System.out.println("juanAccount balance = " + juanAccount.getBalance());

        juanAccount.uploadMoney(100);
        System.out.println("juanAccount balance = " + juanAccount.getBalance());

        juanAccount.takeMoney(-1000);
        System.out.println(juanAccount.getBalance());

    }
}
