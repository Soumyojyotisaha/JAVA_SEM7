public class Expdemo_2 {
    public static void main(String[] args) {
        int a = 10, b = 0, c = 0;
        int[] arr = null;

        try {
            c = a / b;
            System.out.println(arr[1]);
        } catch (ArithmeticException e) {
            System.out.println("x: Arithmetic Exception Error");
        } catch (NullPointerException e) {
            System.out.println("x: Null Pointer Exception Error");
        } catch (Exception e) {
            System.out.println("x: ERROR");
        } finally {
            System.out.println("x: FINAL");
        }

        System.out.println("value " + c);
        System.out.println("x: End");
    }
}