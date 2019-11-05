// HELP NEEDED

public class Exercise_7_14 {
    public static void main(String[] args) {
        int[] list = {1,2,3};
    }

    public static int lcm(int[] numbers){
        int lcm = 1;
        boolean isLCM = false;

        for (int i = 1; i < 7; i++) {
            for (int j = numbers[i]; j < numbers.length; j++) {
                if (i % j != 0){
                    isLCM = false;
                    break;
                }
                else isLCM = true;
                lcm = i;
            }

        }
        return lcm;
    }
}
