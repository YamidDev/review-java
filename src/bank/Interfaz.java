package bank;

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        System.out.println("please type your dni...");
        Scanner sc = new Scanner(System.in);
        String dni = sc.nextLine();
        System.out.println("please type your pass...");
        String pass = sc.nextLine();
        Ath ath = new Ath(dni, pass);
        int optionSelected;
        do {
            System.out.println("Choose one of next options");
            System.out.println("type 1 for get your balance");
            System.out.println("type 2 for upload money");
            System.out.println("type 3 for take money");
            System.out.println("type 4 for view more movements");
            System.out.println("for exit type another number");

            Scanner athInput = new Scanner(System.in);
            optionSelected = athInput.nextInt();

            switch (optionSelected) {
                case 1:
                    ath.showBalance();
                    break;
                case 2:
                    ath.uploadMoney();
                    break;
                case 3:
                    ath.takeMoney();
                    break;
                case 4:
                    ath.queryLastsTransactions();
                    break;
                default:
                    ath.exit();
                    break;
            }
        } while (optionSelected == 1 || optionSelected ==2 || optionSelected ==3 || optionSelected ==4 );
    }
}
