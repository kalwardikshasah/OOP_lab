class Demo{
    void calculate(float a){
        System.out.println(" Float Method ");
    }
    void calculate(double a){
        System.out.println(" Double method ");
    }
}

public class AmbiguityAvoidance {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.calculate(10.0);
       
    }
}
