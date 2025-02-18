import java.util.Scanner;

public class SqStarPattern {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows/columns: ");
        int a = scanner.nextInt();
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
