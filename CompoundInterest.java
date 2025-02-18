import java.util.Scanner;

public class CompoundInterest {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Rate of interest: ");
        double b = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double c = scanner.nextDouble();
        System.out.print("Enter Number of times interest applied per year: ");
        int d = scanner.nextInt();
        double compoundInterest = a * Math.pow((1 + b / (100 * d)), d * c) - a;
        System.out.println("Compound Interest is: " + compoundInterest);
        scanner.close();
    }
}
