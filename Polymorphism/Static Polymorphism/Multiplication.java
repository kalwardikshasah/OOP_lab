class Mul{
    int multiply(int a , int b){
        return a * b;
    }
    double multiply(double a , double b){
        return a * b;
    }
}

public class Multiplication {
    public static void main(String[] args) {
        Mul m = new Mul();
        System.out.println(" Multiplication int : " +m.multiply(45, 10));
        System.out.println("Multiplication Double : " +m.multiply(4.8, 0.2));
    }
}
