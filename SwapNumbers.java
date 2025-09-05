import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x and y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        x = x + y; 
        y = x - y; 
        x = x - y; 

        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}   