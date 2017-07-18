package minimart;

public class Customer {
    
    public static void main(String[] args){
        System.out.println("Good moning Customer");
        
        OnlineShoppingStore onlineStore  = new OnlineShoppingStore();
        
        onlineStore.showItems();
        onlineStore.getInputFromCustomer();
        
    }
}
