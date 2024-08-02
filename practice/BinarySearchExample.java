import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10,53,99};

        int valueToFind = 53;
        int index = Arrays.binarySearch(a, valueToFind);

        if (index >= 0) {
            System.out.println("Value " + valueToFind + " found at index " + index);
        } else {
            System.out.println("Value " + valueToFind + " not found. Insertion point: " + (-index - 1));
        }
    }
}
