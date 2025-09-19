import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        
        if ((n & 1) == 0) {
            System.out.println("Number " + n + " is Even Number.");
        } else {
            System.out.println("Number " + n + " is Odd Number.");
        }
    }
}   