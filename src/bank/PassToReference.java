package bank;

public class PassToReference {
    public static void main(String[] args) {
        int var1 = 23;
        int var2 = var1;
        System.out.println("El valor de var1 es: "+var1);
        System.out.println("El valor de var2 es: "+var2);

        var2 = 78;

        System.out.println("El valor de var1 es: "+var1);
        System.out.println("El valor de var2 es: "+var2);

        BankAccount julietaAcc = new BankAccount("Julieta", BankAccount.SAVING_TYPE, 23_500);
        julietaAcc.balance = 23_500;

        BankAccount anaCredit = julietaAcc;
        anaCredit.balance = 10_000;

        System.out.println("Julieta saldo = " + julietaAcc.balance);
        System.out.println("Ana saldo = " + anaCredit.balance);

    }
}
