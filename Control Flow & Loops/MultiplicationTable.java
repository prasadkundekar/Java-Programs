import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();
        System.out.print("Enter the maximum multiplier: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }

        scanner.close();
    }
}   