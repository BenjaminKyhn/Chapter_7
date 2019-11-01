import java.util.Scanner;

public class Exercise_7_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize an array with length 10
        double[] numbers = new double[10];

        // Fill the array with values
        System.out.println("Enter 10 double values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Invoke the average method. Java automatically knows which of the methods to use.
        System.out.println(average(numbers));
    }

    // Method for calculating the average using integer values
    public static int average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }

    // Method for calculating the average using double values
    public static double average(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
}
