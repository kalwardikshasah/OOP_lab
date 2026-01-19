public class Primenumber {
    public static void main(String[] args) {

        int x = 7;
        int count = 0;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is a composite number");
        }
    }
}

