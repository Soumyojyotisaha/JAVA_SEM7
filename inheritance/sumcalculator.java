class SumCalculator {
    int sum;
    
    SumCalculator(int[] numbers) {
    sum = 0;
    for (int number : numbers) {
    sum += number;
    }
    System.out.println("Sum of integers: " + sum);
    }
    
    public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5}; // Example input
    new SumCalculator(numbers);
    }
    }
    