class Book {
    private String title;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class TestBook {
    public static void main(String[] args) {
        Book b = new Book();

        b.setTitle("Java Programming");
        b.setPrice(499.99);

        System.out.println("Title: " + b.getTitle());
        System.out.println("Price: " + b.getPrice());
    }
}