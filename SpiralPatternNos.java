import java.util.Scanner;

public class SpiralPatternNos {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the spiral (n x n): ");
        int a = scanner.nextInt();
        int[][] matrix = new int[a][a];
        int value = 1;
        int top = 0, bottom = a - 1, left = 0, right = a - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
