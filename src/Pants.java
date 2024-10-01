public class Pants extends Clothing {
    private String material;

    public Pants(String type, double price, String size, String material) {
        super(type, price, size);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Material: " + material);
    }
}