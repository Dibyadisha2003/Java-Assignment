import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        long factorial = findFactorial(a);
        System.out.println("The factorial of " + a + " is: " + factorial);
        scanner.close();
    }
    public static long findFactorial(int a) {
        long fact = 1;
        for (int b = 1; b <= a; b++) {
            fact *= b;
        }
        return fact;
    }
}
