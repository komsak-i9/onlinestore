package minimart;

class Item {

    private int id;
    private String name;
    private double price;
    private int    qty;
    
    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void setQty(int amount) {
        this.qty = amount;
    }
}
