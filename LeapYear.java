import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int a = scanner.nextInt();
        if (isLeapYear(a)) {
            System.out.println(a + " is a leap year.");
        } else {
            System.out.println(a + " is not a leap year.");
        }
        scanner.close();
    }
    public static boolean isLeapYear(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
