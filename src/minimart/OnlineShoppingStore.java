package minimart;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShoppingStore {

    ArrayList<Item> items;
    ArrayList<Item> shoppingCart;

    public OnlineShoppingStore() {
        items = new ArrayList<>();
        shoppingCart = new ArrayList<>();
        items.add(new ClockItem(1, 10));
        items.add(new ChairItem(2, 40));
        items.add(new CalculatorItem(3, 20));
    }

    public void askCustomerToBuy() {
        System.out.println("What would you like to buyte?");
    }

    public void getInputFromCustomer() {
    String input; 
        
        do {
            askCustomerToBuy();
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            for (Item item : items) {
                if (Integer.valueOf(input) == item.id) {
                    System.out.println("what amount of " + item.name + " ?");
                    input = sc.nextLine();
                    int amount = Integer.valueOf(input);
                    item.setQty(amount);
                    shoppingCart.add(item);
                    break;
                }
            }
            System.out.println("do you want to continue shopping (y/N)?");
            input = sc.nextLine();

        } while (input.equalsIgnoreCase("y"));
        if (shoppingCart.size() > 0) {
        System.out.println("Thanks you for shopping, you have " +shoppingCart.size()+ " item in shopping cart, please checkout");
        }
     }

    public void showItems() {
        items.forEach((item) -> {
            System.out.println(item.id + ":" + item.name + "(" + item.price + ")");
        });
    }
}
