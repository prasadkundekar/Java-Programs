import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicatesWithStreams(int[] data) {
        return Arrays.stream(data).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 1, 4, 2, 1, 5};
        System.out.println("Original array: " + Arrays.toString(originalArray));

        int[] uniqueArray = removeDuplicatesWithStreams(originalArray);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}    
    

