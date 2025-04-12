package package1;

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<String> shoppingList=new ArrayList<>();
        shoppingList.add("banana");
        shoppingList.add("apple");
        shoppingList.add("bread");
        shoppingList.add("milk");
        shoppingList.add("butter");

        System.out.println("First item: " +shoppingList.get(0));
        System.out.println("Last item: " +shoppingList.get(shoppingList.size() - 1));

        shoppingList.remove(1);
        System.out.println("After removing apple: "+shoppingList);

        shoppingList.set(2,"juice");
        System.out.println("After updating milk with juice: "+shoppingList);

        System.out.println("Shopping list items:");
        for(String list:shoppingList){
            System.out.println(list);
        }
    }
}
