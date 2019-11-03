import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Input 10 numbers to reverse them: ");

        // Fill the array with numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Print out the reversed array
        System.out.println(Arrays.toString(reverse(array)));
    }

    // Method for reversing an array
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1;
             i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}
