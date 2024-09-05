import java.util.*;
public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4};
        int[] dest = new int[4];
        System.arraycopy(src, 0, dest, 0, 4);
        System.out.println("Destination array: " + Arrays.toString(dest)); // Prints: [1, 2, 3, 4]
    }
}
