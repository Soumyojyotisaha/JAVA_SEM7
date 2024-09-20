public class Expdemo_1 {
    public static void main(String args[]) {
        int a = 10, b = 0, c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.err.println("x: " + e);
        }

        System.out.println("value " + c);
        System.out.println("x: " + "End");
    }
}