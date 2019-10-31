import java.util.Scanner;

public class Exercise_7_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The number of even numbers is " + numberOfEvenNumbers(numbers));
        System.out.println("The number of even numbers is " + numberOfOddNumbers(numbers));
    }

    public static int numberOfEvenNumbers(int [] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0)
                count++;
        }
        return count;
    }

    public static int numberOfOddNumbers(int [] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && numbers[i] != 0)
                count++;
        }
        return count;
    }
}
