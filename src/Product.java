public abstract class Product {
    protected String type;
    protected double price;
    protected static int prodCount = 0;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
        prodCount++;
    }

    public abstract void displayInfo();

    public static int getProdCount() {
        return prodCount;
    }
}
