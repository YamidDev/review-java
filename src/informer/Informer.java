package informer;

public class Informer {

    public static final String DEFAULT_COLOR = "\u001B[0m";
    public static final String BLACK_COLOR = "\u001B[30m";
    public static final String RED_COLOR = "\u001B[31m";
    public static final String GREEN_COLOR = "\u001B[32m";
    public static final String YELLOW_COLOR = "\u001B[33m";
    public static final String BLUE_COLOR = "\u001B[34m";

    void showInWindow(int entero) {
        System.out.println("valor: "+ entero);
    }

    void showInWindow(double decimal) {
        System.out.println("decimal = " + decimal);
    }
    
    void showInWindow(String text) {
        System.out.println("texto = " + text);
    }

    void showInWindow(String text, String color) {
        System.out.println(color + "texto = " + text + DEFAULT_COLOR);
    }
}
