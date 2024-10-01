public class Laptop extends Electronics {
    private int ramSize;
    private int romSize;

    public Laptop(String name, double price, String brand, String model, int ramSize, int romSize) {
        super(name, price, brand, model);
        this.ramSize = ramSize;
        this.romSize = romSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size: " + ramSize + " GB, " + "ROM Size: " + romSize + " GB");
    }
}