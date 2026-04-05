class Display{

    void show(int a ,String b ){
        System.out.println("Int then String : " +a+ " " +b);
    }
    void show(String a , int b){
        System.out.println("String then Int : " +a+ " " +b);
    }
}

public class OrderParameter {
    public static void main(String[] args) {
        Display d =new Display();
        System.out.println("----------------------------------");
        d.show(10 , "Hello");
        d.show( "Hi", 20);

    }
}
