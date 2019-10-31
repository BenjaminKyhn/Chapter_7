import java.util.Arrays;

public class Exercise_7_07 {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 0; i < 200; i++) {
            counts[(int)(Math.random()*10)]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println("Counted " + counts[i] + " " + i + "s");
        }
    }
}
