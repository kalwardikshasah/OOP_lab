interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

public class TestPayment {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        UPI u = new UPI();

        c.pay();
        u.pay();
    }
}