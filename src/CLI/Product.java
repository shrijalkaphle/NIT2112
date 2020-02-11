package CLI;

public class Product {

    private String name;
    private int price;
    private int qty = 0;
    private int total = 0;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(int cent) {
        price = cent;
    }

    public void addToTotal(int amount) {
        qty = qty + amount;
        total = total + amount * price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return total;
    }

    public int getQty() {
        return qty;
    }
}
