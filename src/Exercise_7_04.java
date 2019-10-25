import java.util.Scanner;

public class Exercise_7_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = {2,2,4,4,3,5};

        System.out.println("The average is " + computeAverage(scores));
        System.out.print("The numbers that are equal to or above the average are: ");
        equalToOrAboveAverage(scores);
    }

    public static double computeAverage(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum / scores.length;
    }

    public static void equalToOrAboveAverage(int[] scores){
        for (int i = 0; i <= scores.length-1; i++) {
            if (scores[i] >= computeAverage(scores)){
                System.out.print(scores[i] + " ");
            }
        }
    }
}
