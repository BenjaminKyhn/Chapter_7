import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_17 {
    public static void main(String[] args) {
        // Read an input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students ");
        int numberOfStudents = input.nextInt();

        // Create an array for student names and one for student scores
        String[] studentNames = new String[numberOfStudents];
        int[] studentScores = new int[numberOfStudents];

        // Fill array with student names
        System.out.println("Enter the names of the students: ");
        for (int i = 0; i < studentNames.length; i++) {
            studentNames[i] = input.next();
        }

        // Fill the array with student scores
        System.out.println("Enter the scores of the students: ");
        for (int i = 0; i < studentScores.length; i++) {
            studentScores[i] = input.nextInt();
        }

        //Sort the array
        sortDecreasing(studentNames, studentScores);

        // Print the sorted array - Kan jeg ikke få den til at udskrive scoren samtidig?
        for (String e:
                studentNames) {
            System.out.print(e + " ");
        }
        System.out.println();

        for (int a :
                studentScores) {
            System.out.print(a + " ");
        }
    }

    public static void sortDecreasing(String [] strs, int [] nums){
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int maxIndex = i;
            String temp;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max){
                    max = nums[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i){
                temp = strs[i];
                strs[i] = strs[maxIndex];
                strs[maxIndex] = temp;

                nums[maxIndex] = nums[i];
                nums[i] = max;
            }
        }
    }
}
