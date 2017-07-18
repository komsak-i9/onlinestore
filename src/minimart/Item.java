package minimart;

class Item {

    int id;
    public  final String name;
    double price;
    int    qty;
    
    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void setQty(int amount) {
        this.qty = amount;
    }
}
