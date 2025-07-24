import java.util.Scanner;
class Solution{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];  
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); 
        }
        System.out.println("the array elements:");
        for (int num : numbers) {
            System.out.println(num); 
        }

        scanner.close(); 
    }
}