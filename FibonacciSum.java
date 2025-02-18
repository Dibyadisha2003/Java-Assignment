import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int a = scanner.nextInt();
        int evenSum = findEvenFibonacciSum(a);
        System.out.println("Sum of even Fibonacci numbers up to " + a + " is: " + evenSum);
        scanner.close();
    }
    public static int findEvenFibonacciSum(int a) {
        int b = 0, c = 1, d = 0, sum = 0;
        while (d <= a) {
            d = b + c;
            b = c;
            c = d;
            if (d % 2 == 0 && d <= a) {
                sum += d;
            }
        }
        return sum;
    }
}