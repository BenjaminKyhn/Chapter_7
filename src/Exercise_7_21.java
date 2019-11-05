import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_21 {
    public static void main(String[] args) {
        int[] list = new int[10];
        Scanner input = new Scanner(System.in);

        // Receive 10 integers and add them to the array
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        // Print the result
        System.out.println("The max is " + max(list));
        System.out.println(Arrays.toString(intNormalizer(list, max(list))));
    }

    // Method for calculating the max integer
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    // Method for normalizing the integers
    public static int[] intNormalizer(int[] array, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] /= max;
        }
        return array;
    }
}
