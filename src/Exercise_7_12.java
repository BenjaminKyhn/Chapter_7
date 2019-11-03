import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Input 10 numbers to reverse them: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(reverse(array)));
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1;
             i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}
