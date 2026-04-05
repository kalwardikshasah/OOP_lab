class Bank{
    void interest(){
        System.out.println(" Bank Interest : 5% ");
    }
}
class ICICI extends Bank{
    void interest(){
        System.out.println(" ICICI Interest : 7% ");
    }
}
class Axis extends Bank{
    void interest(){
        System.out.println(" Axis Interest : 6.5% ");
    }
}

public class InterestCalculation {
    public static void main(String[] args) {
      ICICI b1 = new ICICI(); 
      b1.interest();
      Axis b2 = new Axis();
      b2.interest(); 
    }
}
