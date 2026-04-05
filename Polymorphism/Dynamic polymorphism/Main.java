class Animal{
    void sound(){
        System.out.println(" Animals sound define ");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
public class Main{
public static void main(String[] args) {
    Dog a = new Dog();
    a.sound();
    Cat a1 = new Cat();
    a1.sound();
}
}