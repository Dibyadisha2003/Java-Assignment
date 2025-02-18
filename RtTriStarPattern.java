import java.util.Scanner;

public class RtTriStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = scanner.nextInt();
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
