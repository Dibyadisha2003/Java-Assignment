import java.util.Scanner;

public class StarPascalsTri {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = scanner.nextInt();
        for (int b = 0; b < a; b++) {
            for (int c = 0; c < a - b - 1; c++) {
                System.out.print(" ");
            }
            for (int d = 0; d <= b; d++) {
                if (d == 0 || d == b) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}