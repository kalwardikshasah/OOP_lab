class Sum{
    int add (int a , int b){
        return a+b;
    }
    int add(int a , int b , int c){
        return a + b + c;
    }
}

public class ChangingNum {
    public static void main(String[] args) {
        Sum a = new Sum();
        System.out.println("Sum of 2 numbers : " +a.add(31, 40));
        System.out.println("Sum of 3 numbers : " +a.add(23, 70, 10));
    }
}
