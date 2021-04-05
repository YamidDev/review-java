package basic;

public class Test {
    public static void main(String[] args) {
        int x, y, z;
        x = 0;
        y = 0;
        z = 70;

        do{
            x = y*15;
            System.out.println(x);
            y++;
        } while (x<z);

        System.out.println("Fin de instrucción while");
    }
}
