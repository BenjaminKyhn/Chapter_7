public class Exercise_7_02 {
    public static void main(String[] args) {
        int[] numbers = {4,1,8,32,5,60,12,54,7,89,32};

        for (int i = 0; i < numbers.length-1; i++) {
            System.out.println(numbers[i] + " is " + compareIntegers(numbers[i], numbers[numbers.length-1]) + " "
                    + numbers[numbers.length-1]);
        }
    }

    public static String compareIntegers(int number, int number11){
        if (number > number11)
            return "greater than";
        else if (number == number11)
            return "equals to";
        else
            return "smaller than";
    }
}
