interface Bank {
    void deposit();
    void withdraw();
}

class SBI implements Bank {
    int balance = 1000;

    public void deposit() {
        balance += 500;
        System.out.println("Balance after deposit = " + balance);
    }

    public void withdraw() {
        balance -= 300;
        System.out.println("Balance after withdraw = " + balance);
    }
}

public class TestBank {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.deposit();
        s.withdraw();
    }
}