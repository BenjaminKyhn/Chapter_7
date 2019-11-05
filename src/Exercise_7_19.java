import java.util.Scanner;

public class Exercise_7_19 {
    public static void main(String[] args) {
        // Get the length of the array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a the number of integers in the list: ");
        int[] list = new int[input.nextInt()];

        // Fill the array with integers
        System.out.println("Enter the value of each integer in the list");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        // Check if the list is sorted
        System.out.println("The list is " + (isSorted(list) ? "already " : "not ") + "sorted");

    }

    // Method for checking if the list is sorted
    public static boolean isSorted(int [] list){
        for (int i = 0; i < list.length; i++) {
            if (list[i] > list[i+1])
                return false;
        }
        return true;
    }
}
