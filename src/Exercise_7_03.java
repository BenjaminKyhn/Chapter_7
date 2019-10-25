import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_03 {
    public static void main(String[] args) {
        int[] counter = new int[50];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers between 1 and 50: ");
        int input = scanner.nextInt();

        while (input != 0) {
            if (input > 0 && input <= 50) {
                counter[input - 1]++;
            }
            input = scanner.nextInt();
        }
        printCount(counter);
    }

    public static void printCount(int[] counter) {
        for (int i = 0; i < counter.length; i++) {

            if (counter[i] != 0)
                System.out.println(i + 1 + " occurs " + counter[i] + (counter[i] > 1 ? " times" : " time"));
        }
    }

}
