public class ArrayAverage {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        // Loop through the array to calculate sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Display result
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}