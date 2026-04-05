// Class Payment:

// pay(int amount) → cash
// pay(int amount, String upiId)
// pay(int amount, long cardNumber)

// Expected Output:

// Paid 1000 using Cash
// Paid 2000 using UPI: abc@upi
// Paid 3000 using Card

class Payment{

    void pay(int amount){
        System.out.println(" Paid " +amount+ " using cash ");
    }
    void pay(int amount , String upiId){
        System.out.println(" Paid " +amount+ " using UPI : " +upiId);
    }
    void pay(int amount , long cardnum){
        System.out.println(" Paid " +amount+ " using card ");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment p = new Payment();
        System.out.println("--------------------------------");
        p.pay(1000);
        p.pay(2000,"abc@upi");
        p.pay(3000, 0);
    }
}
