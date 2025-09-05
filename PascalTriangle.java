
public class PascalTriangle {
    static void printPascal(int n) {
        for (int row = 0; row < n; row++) {
            int c = 1;

            // Print spaces for alignment
            for (int j = 0; j < n - row; j++) {
                System.out.print(" ");
            }

            // Print numbers in the row
            for (int i = 0; i <= row; i++) {
                System.out.print(c + " ");
                c = c * (row - i) / (i + 1);  // Correct formula
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }
}
