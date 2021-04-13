package informer;

public class Main {
    public static void main(String[] args) {
        Informer informer = new Informer();
        informer.showInWindow(3);
        informer.showInWindow(3.3);
        informer.showInWindow("Hola mundo");
        informer.showInWindow("Hola mundo en amarillo", Informer.YELLOW_COLOR);
        informer.showInWindow("Hola mundo en azul", Informer.BLUE_COLOR);
        informer.showInWindow("Hola mundo en rojo", Informer.RED_COLOR);
        informer.showInWindow("Hola mundo en verde", Informer.GREEN_COLOR);

    }
}
