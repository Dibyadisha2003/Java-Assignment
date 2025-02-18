import java.util.Scanner;

public class RectPerimeter {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double b = scanner.nextDouble();
        double perimeter = 2 * (a + b);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
        scanner.close();
    }
}
