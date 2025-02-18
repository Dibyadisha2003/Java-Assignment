import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int lcm = (a * b) / findGCD(a, b);
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
        scanner.close();
    }
    public static int findGCD(int c, int d) {
        while (d != 0) {
            int temp = d;
            d = c % d;
            c = temp;
        }
        return c;
    }
}
