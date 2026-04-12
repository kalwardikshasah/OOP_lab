class Laptop {
    private String brand;
    private int ram;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }
}

public class TestLaptop {
    public static void main(String[] args) {
        Laptop l = new Laptop();

        l.setBrand("HP");
        l.setRam(16);

        System.out.println("Brand: " + l.getBrand());
        System.out.println("RAM: " + l.getRam() + "GB");
    }
}