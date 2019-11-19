import java.util.Scanner;

public class Exercise_7_33 {
    public static void main(String[] args) {
        System.out.println("Enter a month number (1-12): ");
        Scanner input = new Scanner(System.in);
        int monthNumber = input.nextInt();
        System.out.println(monthConverter(monthNumber));
    }

    public static String monthConverter(int monthNumber){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        return months[monthNumber-1];
    }
}