import java.util.Scanner;

public class SystemNumericScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type a number");
        String numberStr = sc.nextLine();
        int number = 0;
        try {
            number = Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            System.out.println("Err you need type a number");
            main(args);
            System.exit(0);
        }
        printMessage(number, "Binary", Integer.toBinaryString(number));
        printMessage(number, "Octal", Integer.toOctalString(number));
        printMessage(number, "Hex", Integer.toHexString(number));
    }

    public static void printMessage(int number, String type, String value) {
        String message = "the value of " + number + " to " + type + " is equal to " + value;
        System.out.println(message);
    }
}
