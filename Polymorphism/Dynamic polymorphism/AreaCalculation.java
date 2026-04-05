class Shape{
    void area(){
        System.out.println(" Calculating Area");
    }
}
class Circle extends Shape{
    void area(){
        double r = 5;
        double are = Math.PI*r*r;
        System.out.println(" Circle Area : " +are);
    }
}
class Square extends Shape{
    void area(){
        int a = 5;
        int are=a*a;
        System.out.println(" Square area : " +are);
    }
}
public class AreaCalculation {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        Square r = new Square();
        r.area();
    }
}
