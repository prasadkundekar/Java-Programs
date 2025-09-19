public class PascalTriangle {
    static void printPascal(int n) {
        for (int row = 0; row < n; row++) {
            int c = 1;

            for (int j = 0; j < n - row; j++) {
                System.out.print(" ");
            }

            for (int i = 0; i <= row; i++) {
                System.out.print(c + " ");
                c = c * (row - i) / (i + 1);  
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }
}
