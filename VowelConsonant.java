import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = scanner.next().charAt(0);
        if (isVowel(a)) {
            System.out.println(a + " is a vowel.");
        } else {
            System.out.println(a + " is a consonant.");
        }
        scanner.close();
    }
    public static boolean isVowel(char a) {
        a = Character.toLowerCase(a); 
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }
}