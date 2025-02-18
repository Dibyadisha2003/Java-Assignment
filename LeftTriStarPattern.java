import java.util.Scanner;

public class LeftTriStarPattern {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = scanner.nextInt();
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= a - b; c++) {
                System.out.print("  "); 
            }
            for (int d = 1; d <= b; d++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
