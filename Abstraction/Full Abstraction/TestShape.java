interface Shape {
    void area();
}

class Circle implements Shape {
    double r = 5;

    public void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

class Rectangle implements Shape {
    int l = 4, b = 6;

    public void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}