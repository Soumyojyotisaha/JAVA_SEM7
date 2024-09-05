public class AddArrayDigits {
    public static void main(String[] args) {
        int array[] = {123, 456, 789};
        int sum = 0;

        for (int num : array) {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }

        System.out.println("Sum of all digits: " + sum);
    }
}
