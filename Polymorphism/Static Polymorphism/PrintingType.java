class Printer{

    String print(String text){
        return text;
    }
    int print(int number){
        return number;
    }
    double print(double value){
        return value;
    }
}
public class PrintingType {

    public static void main(String[] args) {

        Printer p = new Printer();
        System.out.println("--------------------------------------------------");
        System.out.println("Printing String : " +p.print("Hello World"));
        System.out.println("Printing Integer : " +p.print(10));
        System.out.println("Printing Double : " +p.print(10.5));
    }
}