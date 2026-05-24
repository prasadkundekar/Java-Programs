//public class Factorial {
//    public static void main(String[] args) {
//        int num = 5;
//        long factorial = 1;
//        for (int i = 1; i <= num; ++i) {
//            factorial *= i;
//        }
//        System.out.printf("Factorial of %d = %d", num, factorial);
//    }
//}

class Factorial{
    public static void main(String args[]){
        int num = 10;
        long factorial = 1;

        for(int i = 1; i <= num; ++i){
            factorial *= i;
            System.out.println(factorial);
        }
        System.out.println("Factorial is : " + factorial);
    }
}



