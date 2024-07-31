import java.util.Scanner;

class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer array
        System.out.println("Enter the size of the integer array:");
        int intSize = scanner.nextInt();
        int[] intArray = new int[intSize];
        System.out.println("Enter " + intSize + " integers:");
        for (int i = 0; i < intSize; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Character array
        System.out.println("Enter the size of the character array:");
        int charSize = scanner.nextInt();
        char[] charArray = new char[charSize];
        System.out.println("Enter " + charSize + " characters:");
        for (int i = 0; i < charSize; i++) {
            charArray[i] = scanner.next().charAt(0);
        }

        // String array
        System.out.println("Enter the size of the string array:");
        int stringSize = scanner.nextInt();
        String[] stringArray = new String[stringSize];
        System.out.println("Enter " + stringSize + " strings:");
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < stringSize; i++) {
            stringArray[i] = scanner.nextLine();
        }

        // Float array
        System.out.println("Enter the size of the float array:");
        int floatSize = scanner.nextInt();
        float[] floatArray = new float[floatSize];
        System.out.println("Enter " + floatSize + " floats:");
        for (int i = 0; i < floatSize; i++) {
            floatArray[i] = scanner.nextFloat();
        }

        // Double array
        System.out.println("Enter the size of the double array:");
        int doubleSize = scanner.nextInt();
        double[] doubleArray = new double[doubleSize];
        System.out.println("Enter " + doubleSize + " doubles:");
        for (int i = 0; i < doubleSize; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        // Print arrays
        System.out.println("\nInteger array:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("String array:");
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Float array:");
        for (float f : floatArray) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Double array:");
        for (double d : doubleArray) {
            System.out.print(d + " ");
        }
        System.out.println();

        scanner.close();
    }
}
