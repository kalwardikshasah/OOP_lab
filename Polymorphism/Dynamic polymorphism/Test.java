class Parent{
    Parent(){
        System.out.println(" Parent constructor ");
    }
    void show(){
        System.out.println(" Parent show method ");
    }
}
class Child extends Parent{
    Child(){
        System.out.println(" Child Constructor ");
    }
    void show(){
        System.out.println(" Child show method ");
    }
}

public class Test{
    public static void main(String[] args) {
       Child c = new Child();
       c.show(); 
    }
}