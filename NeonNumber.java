import java.util.Scanner;

public class NeonNumber {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        if (isNeon(a)) {
            System.out.println(a + " is a Neon number.");
        } else {
            System.out.println(a + " is not a Neon number.");
        }
        scanner.close();
    }
    public static boolean isNeon(int a) {
        int square = a * a;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == a;
    }
}
