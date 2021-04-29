package bank;

public class Main {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>("Hi!");

        Integer number = 5;
        Box<Integer> box2 = new Box<>(number);
        String myString = "Gato";

        box1.isContentPartOfClass(myString);
        System.out.println("isContentPartOfClass(myString) = " + box1.isContentPartOfClass(myString));
        System.out.println("isContentPartOfClass(myString) = " + box2.isContentPartOfClass(myString));

        BankAccount juanAccount = new BankAccount("Juan Martinez", AccountType.PAYROLL, 23_500);

        juanAccount.takeMoney(500);

        System.out.println("juanAccount balance = " + juanAccount.getBalance());

        juanAccount.uploadMoney(100);
        System.out.println("juanAccount balance = " + juanAccount.getBalance());

        juanAccount.takeMoney(-1000);
        System.out.println(juanAccount.getBalance());

    }
}
