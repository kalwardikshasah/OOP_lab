class A{
    void display(){
        System.out.println(" Classes Defined ");
    }
}
class B extends A{
    void display(){
        System.out.println(" class B display");
    }
}
class C extends B{
    void display(){
        System.out.println(" class C display ");
    }
}

public class ClassesGroup {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
}
