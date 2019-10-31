import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list length: ");
        int n = input.nextInt();
        boolean[] list = new boolean[n];

        // Initialize the array
        for (int i = 0; i < list.length-1; i++) {
            list[i] = false;
        }

        // Check for primes and change the array elements to either true or false
        for (int i = 1; i < list.length; i++) {
            list[i] = isPrime(i+1);
        }

        // Print the array
        System.out.print("The prime numbers are: ");
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i])
                System.out.print(i+1 + " ");
        }
    }

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0){
                return false; // Number is not a prime
            }
        }
        return true; // Number is a prime
    }

}
