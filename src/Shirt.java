public class Shirt extends Clothing {
    private String color;

    public Shirt(String type, double price, String size, String color) {
        super(type, price, size);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}