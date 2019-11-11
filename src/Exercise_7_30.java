import java.util.Scanner;

public class Exercise_7_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int numberOfValues = input.nextInt();
        int[] list = new int[numberOfValues];

        // Fill the array
        System.out.println("Enter the values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        // Print the result
        System.out.println("The list has" + (isConsecutiveFour(list) ? "" : " no") + " consecutive fours");
    }

    // Method for finding 4 consecutive numbers
    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3])
                return true;
        }
        return false;
    }
}
