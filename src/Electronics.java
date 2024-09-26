public class Electronics extends Product {
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
}