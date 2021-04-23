package bank;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ath {
    BankAccount bankAccountAct;
    double balance;

    Ath(String id, String pass) {
        double randomCant = ThreadLocalRandom.current().nextDouble(0, 50000);
        bankAccountAct = new BankAccount("Yamid Cueto", randomCant);
    }

    void showBalance() {
        System.out.println("Your Balance is: "+ bankAccountAct.getBalance());
    }

    void uploadMoney() {
        System.out.println("¿How much money charge?");
        Scanner sc = new Scanner(System.in);
        balance = sc.nextDouble();
        bankAccountAct.uploadMoney(balance);
    }

    void takeMoney() {
        System.out.println("¿How much money take?");
        Scanner sc = new Scanner(System.in);
        balance = sc.nextDouble();
        bankAccountAct.takeMoney(balance);
    }

    void queryLastsTransactions() {
        System.out.println("consulting data...");
    }


    void exit() {
        System.out.println("Thanks for using ours services");
    }
}
