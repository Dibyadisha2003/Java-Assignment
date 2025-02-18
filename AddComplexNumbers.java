import java.util.Scanner;

public class AddComplexNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();
        double realSum = real1 + real2;
        double imaginarySum = imaginary1 + imaginary2;
        System.out.println("The sum of the complex numbers is: " + realSum + " + " + imaginarySum + "i");
        scanner.close();
    }
}