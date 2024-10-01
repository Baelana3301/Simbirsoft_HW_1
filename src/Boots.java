public class Boots extends Clothing {
    private String kind;
    private String brand;
    private String color;

    public Boots(String type, double price, String size, String kind, String brand, String color) {
        super(type, price, size);
        this.kind = kind;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kind: " + kind + ", Brand: " + brand + ", Color: " + color);
    }
}