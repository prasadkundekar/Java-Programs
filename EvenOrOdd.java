import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nums = in.nextInt();
        if(nums%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }

    }
}