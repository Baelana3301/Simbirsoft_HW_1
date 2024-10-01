public class Clothing extends Product implements Discountable, Reviewable {
    private String size;
    private boolean isDiscountApplied;

    public Clothing(String type, double price, String size) {
        super(type, price);
        this.size = size;
        this.isDiscountApplied = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothing: " + type + ", Size: " + size + ", Price: $" + price);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        if (!isDiscountApplied) {
            price -= price * (discountPercentage / 100);
            isDiscountApplied = true;
            System.out.println("Discount applied. New price: $" + price);
        } else {
            System.out.println("Discount is already applied.");
        }
    }

    @Override
    public void addReview(String review) {
        System.out.println("Review added: " + review);
    }
}