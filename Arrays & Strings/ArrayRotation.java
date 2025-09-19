import java.util.Arrays;

public class ArrayRotation {
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        for (int i = 0; i < d; i++) {
            int temp = arr[0]; 
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        for (int i = 0; i < d; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int rotations = 4;

        System.out.println("Original Array:");
        printArray(array);

        rotateLeft(array, rotations);
        System.out.println("Array after left rotation by " + rotations + " positions:");
        printArray(array);

        rotateRight(array, rotations);
        System.out.println("Array after right rotation by " + rotations + " positions:");
        printArray(array);
    }
}