class Test{
    void display(int a){
        System.out.println(" Integer method ");
    }
    void display(double a){
        System.out.println(" Double Method ");
    }
}

public class TypePromotion {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println("--------------------------------");
        t1.display(6);
        t1.display(3.8);
    }
}
