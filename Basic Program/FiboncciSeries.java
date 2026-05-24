//public class FiboncciSeries {
//    public static void main(String[] args) {
//        int n = 10;
//        int num1 = 0, num2 = 1;
//        System.out.print("Fibonacci Series using Iterative Approach: ");
//        for (int i = 1; i <= n; ++i) {
//            System.out.print(num1 + " ");
//            int sum = num1 + num2;
//            num1 = num2;
//            num2 = sum;
//        }
//    }
//}



class FibonacciSeries{
    public static void main(String args[]){
        int num = 10;
        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci series in iterative approach : ");
        for (int i = 1; i <= num; ++i){
            System.out.println(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}