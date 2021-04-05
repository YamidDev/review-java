package basic;

import javax.swing.*;

public class SystemNumeric {
    public static void main(String[] args) {
        String numberStr = JOptionPane.showInputDialog(null, "type a number");
        int number = 0;
        try {
            number = Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Err you need type a number");
            main(args);
            System.exit(0);
        }
        printMessage(number, "Binary", Integer.toBinaryString(number));
        printMessage(number, "Octal", Integer.toOctalString(number));
        printMessage(number, "Hex", Integer.toHexString(number));
    }

    public static void printMessage(int number, String type, String value) {
        String message = "the value of " + number + " to " + type + " is equal to " + value;
        JOptionPane.showMessageDialog(null, message);
    }
}
