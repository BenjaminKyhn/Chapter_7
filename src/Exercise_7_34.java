import java.util.Scanner;

public class Exercise_7_34 {
    public static void main(String[] args) {
        System.out.println("Enter a string to be sorted in alphabetical order: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(sort(str));
    }

    public static String sort(String s){
        char[] stringChars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            stringChars[i] = s.charAt(i);
        }

        for (int i = 0; i < stringChars.length; i++) {
            char min = stringChars[i];
            int minIndex = i;

            for (int j = i + 1; j < stringChars.length; j++) {
                if (stringChars[j] < min){
                    min = stringChars[j];
                    minIndex = j;
                }
            }

            if (minIndex != i){
                stringChars[minIndex] = stringChars[i];
                stringChars[i] = min;
            }
        }
        return new String(stringChars);
    }
}
