// Example 4:
// Question: Handle multiple types of exceptions within one try block.

class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            int i = 8;
            int j = 0;
            int a[] = new int[5];
            int k = i / j; // may throw arithmetic exception
            a[6] = 10; // may throw array index out of bounds exception
            System.out.println("K value is: " + k);
        }
        catch (ArithmeticException e) {
            System.out.println("Error in arithmetic");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array limit exceeds..");
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("\nProgram completed");
        }
    }
}
