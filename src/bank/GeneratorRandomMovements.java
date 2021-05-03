package bank;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratorRandomMovements {
    public static final String TRANSFER = "Transferencia de ";
    public static final String IN = "Ingreso de ";
    public static final String OUT = "Retirada de ";
    public static final String PAY_WITH_CARD = "Pago con tarjeta de ";
    public static final String MORTGAGE = "Ingreso nómina de ";
    public static final String PAY_TICKET = "Pago de recibo de ";

    ArrayList<String> getMovements (int numberOfMovements, String coin) {
        ArrayList<String> movements = new ArrayList<>();
        for (int i = 0; i < numberOfMovements; i++) {
            int numberOfMovement = getIntRandom(1, 6);
            String typeMovement;
            switch (numberOfMovement) {
                case 1:
                    typeMovement = TRANSFER;
                    break;
                case 2:
                    typeMovement = IN;
                    break;
                case 3:
                    typeMovement = OUT;
                    break;
                case 4:
                    typeMovement = PAY_WITH_CARD;
                    break;
                case 5:
                    typeMovement = MORTGAGE;
                    break;
                default:
                    typeMovement = PAY_TICKET;
            }
            double cantRandom = getDoubleRandom(1.0, 3000.0);
            String movement = typeMovement + String.format("%.2f", cantRandom) +" "+ coin;
            movements.add(movement);
        }
        return movements;
    }

    private int getIntRandom(int min, int max ) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private double getDoubleRandom (double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max + 1.0);
    }

}
