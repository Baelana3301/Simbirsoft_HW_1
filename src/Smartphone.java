public class Smartphone extends Electronics {
    private String operatingSystem;

    public Smartphone(String type, double price, String brand, String model, String operatingSystem) {
        super(type, price, brand, model);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
    }
}