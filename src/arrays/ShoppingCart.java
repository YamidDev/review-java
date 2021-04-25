package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> myShoppingCart = new ArrayList<>();
        myShoppingCart.add("Huevos");
        myShoppingCart.add("Leche");
        myShoppingCart.add("Manzanas");
        myShoppingCart.add("Pan");
        System.out.println("myShoppingCart = " + myShoppingCart);

        ArrayList<String> myShoppingJanuary = new ArrayList<>();
        myShoppingJanuary.add("Harina");
        System.out.println("myShoppingJanuary = " + myShoppingJanuary);

        System.out.println("The First element of my shopping in january is: "+ myShoppingJanuary.get(0));
        myShoppingJanuary.set(0, "Leche entera");
        System.out.println("The First element of my shopping in january is: "+ myShoppingJanuary.get(0));
        System.out.println(myShoppingJanuary.size());
    }
}
