import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Rate of interest: ");
        double b = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double c = scanner.nextDouble();
        double simpleInterest = (a * b * c) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
        scanner.close();
    }
}
