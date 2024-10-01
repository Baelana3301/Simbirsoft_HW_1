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

    public interface Discountable {
        void applyDiscount(double discountPercentage);
    }

    public interface Reviewable {
        void addReview(String review);
    }
}
