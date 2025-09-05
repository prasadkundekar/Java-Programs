import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (isVowel(ch)) {
                    vowelCount++;
                }
                else if (isConsonant(ch)) {
                    consonantCount++;
                }
            }
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'a' && ch <= 'z' && !isVowel(ch);
    }
}   