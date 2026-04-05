class Vehicle{
    void show(){
        System.out.println(" Vehicle Info ");
    }
}
class Car extends Vehicle{
    void show(){
        super.show();
        System.out.println(" Car Info ");
    }
}

public class TransportationInfo{
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        
    }
}