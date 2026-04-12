class Product {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class TestProduct {
    public static void main(String[] args) {
        Product p = new Product();

        p.setName("Shoes");
        p.setPrice(2000);

        p.applyDiscount(10);

        System.out.println("Product: " + p.getName());
        System.out.println("Final Price: " + p.getPrice());
    }
}