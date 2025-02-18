import java.util.Scanner;

public class DownTriStarPattern {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = scanner.nextInt();
        for (int b = a; b >= 1; b--) {
            for (int c = 1; c <= b; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
