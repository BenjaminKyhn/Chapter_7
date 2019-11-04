import java.util.Arrays;

public class Exercise_7_17 {
    public static void main(String[] args) {
        String[] studentNames = {"Kelvin", "Benjamin"};
        int[] studentScores = {50,99};
        sortDecreasing(studentNames, studentScores);

        // Kan jeg ikke få den til at udskrive scoren samtidig?
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
