import java.util.Scanner;

public class Exercise_7_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 double values: ");
        double[] list = new double[10];

        // Fill the array with double values
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        // Sort the array
        bubbleSort(list);

        // Print the sorted array
        for (double e :
                list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    // Method for bubble sorting in decreasing order
    public static void bubbleSort(double[] list) {
        boolean swapped;
        double temp;

        do {
            swapped = false;
            for (int i = list.length - 1; i > 0; i--) {
                if (list[i] > list[i - 1]) {
                    temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
