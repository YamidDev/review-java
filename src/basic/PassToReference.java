package basic;

import bank.AccountType;
import bank.BankAccount;

public class PassToReference {
    public static void main(String[] args) {
        int var1 = 23;
        int var2 = var1;
        System.out.println("El valor de var1 es: "+var1);
        System.out.println("El valor de var2 es: "+var2);

        var2 = 78;

        System.out.println("El valor de var1 es: "+var1);
        System.out.println("El valor de var2 es: "+var2);

        BankAccount julietaAcc = new BankAccount("Julieta", AccountType.SAVING, 23_500);
        julietaAcc.setBalance(23_500);

        BankAccount anaCredit = julietaAcc;
        anaCredit.setBalance(10_000);

        System.out.println("Julieta saldo = " + julietaAcc.getBalance());
        System.out.println("Ana saldo = " + anaCredit.getBalance());

    }
}
