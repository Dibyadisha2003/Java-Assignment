import java.util.Scanner;

public class AddBinaryStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first binary string: ");
        String a = scanner.nextLine(); 
        System.out.print("Enter the second binary string: ");
        String b = scanner.nextLine();
        int x = Integer.parseInt(a, 2); 
        int y = Integer.parseInt(b, 2); 
        int sum = x + y; 
        String result = Integer.toBinaryString(sum); 
        System.out.println("The sum of the binary strings is: " + result);
        scanner.close();
    }
}