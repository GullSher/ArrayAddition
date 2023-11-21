
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array
        int[] numbers = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Call the method to calculate the average
        double average = calculateAverage(numbers);

        // Display the result
        System.out.println("The average of the array elements is: " + average);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the average of elements in an array
    private static double calculateAverage(int[] array) {
        // Initialize a variable to store the sum
        int sum = 0;

        // Use a loop to iterate through the array and add each element to the sum
        for (int num : array) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Return the final average
        return average;
    }
}
