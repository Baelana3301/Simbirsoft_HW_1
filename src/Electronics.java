public class Electronics extends Product implements Discountable, Reviewable {
    private final String brand;
    private final String model;
    private boolean isDiscountApplied;

    public Electronics(String type, double price, String brand, String model) {
        super(type, price);
        this.brand = brand;
        this.model = model;
        this.isDiscountApplied = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + type + ", Model: " + brand + " " + model + ", Price: $" + price);
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