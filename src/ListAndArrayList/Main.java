package ListAndArrayList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args){

        groceryList.addItem("Cheese");
        groceryList.addItem("Milk");
        groceryList.printList();
        groceryList.addItem("CHEE");
        groceryList.removeItem(2);
        System.out.println("?D?DSAD");
        groceryList.printList();

    }
}
