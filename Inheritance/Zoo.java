class Animals {
    String name;
    int age;
    String dietType;

    Animals(String name, int age, String dietType){
        this.name = name;
        this.age = age;
        this.dietType = dietType;
    }

    void eat(){
        System.out.println(name + " is eating.");
    }

    void sleep(){
        System.out.println(name + " is sleeping.");
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diet Type: " + dietType);
    }
}

class Mammal extends Animals {
    String furColor;

    Mammal(String name, int age, String dietType, String furColor){
        super(name, age, dietType);
        this.furColor = furColor;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Fur Color: " + furColor);
    }

    void run(){
        System.out.println(name + " is running.");
    }
}

class Bird extends Animals {
    double wingSpan;

    Bird(String name, int age, String dietType, double wingSpan){
        super(name, age, dietType);
        this.wingSpan = wingSpan;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Wing Span: " + wingSpan + " meters");
    }

    void fly(){
        System.out.println(name + " is flying.");
    }
}

class Reptile extends Animals {
    boolean isVenomous;

    Reptile(String name, int age, String dietType, boolean isVenomous){
        super(name, age, dietType);
        this.isVenomous = isVenomous;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Venomous: " + isVenomous);
    }

    void crawl(){
        System.out.println(name + " is crawling.");
    }
}

public class Zoo {
    public static void main(String[] args) {

        Animals a1 = new Mammal("Lion", 5, "Carnivore", "Golden");
        Animals a2 = new Bird("Parrot", 4, "Herbivore", 1.2);
        Animals a3 = new Reptile("Snake", 2, "Carnivore", true);

        a1.display();
        System.out.println("----------");

        a2.display();
        System.out.println("----------");

        a3.display();
    }
}
