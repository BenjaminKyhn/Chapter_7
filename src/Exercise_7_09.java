import java.util.Scanner;

public class Exercise_7_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers to find the max value: ");
        double[] numbers = new double[10];

        // Fill the array with inputs
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Display the max result
        System.out.println("The largest number is " + max(numbers));
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
