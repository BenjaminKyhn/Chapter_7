import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_10b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers to find the max value: ");
        double[] numbers = new double[10];

        // Fill the array with inputs
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Display the max result
        System.out.println("The largest number is " + numbers[indexOfLargestElement(numbers)] + " and the index is " +
                indexOfLargestElement(numbers));
    }


    public static int indexOfLargestElement(double[] array){
        double max = array[0];
        int maximumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maximumIndex = i;
            }
        }
        return maximumIndex;
    }
}
