import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Armstrong numbers between " + a + " and " + b + " are:");
        for (int c = a; c <= b; c++) {
            if (isArmstrong(c)) {
                System.out.print(c + " ");
            }
        }
        scanner.close();
    }
    public static boolean isArmstrong(int c) {
        int sum = 0, original = c;
        int digits = String.valueOf(c).length();
        while (c > 0) {
            int digit = c % 10;
            sum += Math.pow(digit, digits);
            c /= 10;
        }
        return sum == original;
    }
}
