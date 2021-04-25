package arrays;

public class WorkWithString {
    public static void main(String[] args) {
        String oneString = "abcde";

        char caracter;

        caracter = oneString.charAt(2);
        System.out.println("caracter = " + caracter);
        System.out.println(oneString.concat("fghij"));
        System.out.println(oneString.length());

    }
}
