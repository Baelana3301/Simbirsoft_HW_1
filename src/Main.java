//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("iPhone", 999.99, "Apple", "16 Pro", "iOS");
        Laptop laptop = new Laptop("MacBook", 1499.99, "Apple", "Pro", 16, 1024);
        Shirt shirt = new Shirt("Casual Shirt", 29.99, "M", "Blue");
        Pants pants = new Pants("Jeans", 49.99, "32", "Denim");
        Boots boots = new Boots("Heels", 250.99, "37", "Stiletto", "Clarks", "Black");

        smartphone.displayInfo();
        smartphone.applyDiscount(10);
        smartphone.addReview("Great phone!");

        laptop.displayInfo();
        laptop.applyDiscount(15);
        laptop.addReview("Excellent performance!");

        shirt.displayInfo();
        shirt.applyDiscount(5);
        shirt.addReview("Comfortable fit!");

        pants.displayInfo();
        pants.applyDiscount(8);
        pants.addReview("Durable material!");

        boots.displayInfo();
        boots.applyDiscount(10);
        boots.addReview("Famous designer!");

        System.out.println("Total products created: " + Product.getProdCount());
    }
}