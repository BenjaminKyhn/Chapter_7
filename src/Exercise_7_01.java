import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter " + numberOfStudents + " scores: ");
        int[] scores = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }

        for (int i = 0; i <= scores.length - 1; i++) {
            System.out.println("Student " + i + " is " + scores[i] + " and grade is " + getGrade(scores[i], bestScore(scores)));
        }
    }

    public static int bestScore(int[] scores) {
        int highScore = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > highScore)
                highScore = scores[i];
        }
        return highScore;
    }

    public static char getGrade(int score, int bestScore) {
        if (score >= bestScore - 5)
            return 'A';
        else if (score >= bestScore - 10)
            return 'B';
        else if (score >= bestScore - 15)
            return 'C';
        else if (score >= bestScore - 20)
            return 'D';
        else
            return 'F';
    }

}
