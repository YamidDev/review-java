package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("El area de un circulo con ratio 4 es: " + calculator.calculateAreaCircle(4.0));
        
        System.out.println("El Volumen de un primas de 5*4*8 es: " + calculator.calculateVolumePrism(5, 4, 8));
        System.out.println("la media de los valores es: " +calculator.calculateAvg(2.6,2,5.9,8));
        
    }
}
