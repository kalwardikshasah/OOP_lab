import java.util.Scanner;
public class Attendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter total working days: ");
        int totalDays = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("\nEnter working days attended by student " + i + ": ");
            int attendedDays = sc.nextInt();

            double attendancePercent = (attendedDays * 100.0) / totalDays;

            System.out.println("Attendance = " + attendancePercent + "%");

            if (attendancePercent >= 75) {
                System.out.println("Eligible for giving exam");
            } else {
                System.out.println("Not eligible for giving exam");
            }
        }

        sc.close();
    }
}