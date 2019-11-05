import java.util.Scanner;

public class Exercise_7_22 {
    public static void main(String[] args) {
        // Read a string input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();

        // Print the result
        System.out.println("The string contains " + lowerCaseVowelCount(stringToArray(string)) + " lower case vowels" +
                "and " + upperCaseVowelCount(stringToArray(string)) + " upper case vowels");
    }

    // Method for converting string to array
    public static char[] stringToArray(String string) {
        char[] array = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }
        return array;
    }

    // Method for counting the number of lowercase chars in an array
    public static int lowerCaseVowelCount(char[] array) {
        int numberOfVowels = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a'
                    || array[i] == 'e'
                    || array[i] == 'i'
                    || array[i] == 'o'
                    || array[i] == 'u'
                    || array[i] == 'y'
                    || array[i] == 'æ'
                    || array[i] == 'ø'
                    || array[i] == 'å')
                numberOfVowels++;
        }
        return numberOfVowels;
    }

    // Method for counting the number of uppercase chars in an array
    public static int upperCaseVowelCount(char[] array) {
        int numberOfVowels = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'A'
                    || array[i] == 'I'
                    || array[i] == 'O'
                    || array[i] == 'U'
                    || array[i] == 'Y'
                    || array[i] == 'Æ'
                    || array[i] == 'Ø'
                    || array[i] == 'Å')
                numberOfVowels++;
        }
        return numberOfVowels;
    }
}
