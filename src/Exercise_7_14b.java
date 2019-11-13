import java.util.Arrays;

public class Exercise_7_14b {
    public static void main(String[] args) {
        int[] numbers = {13, 7, 42};
        System.out.println(lcm(numbers));
    }

    public static int lcm(int... numbers) {
        int potentialLCM = 1;

        for (; ; potentialLCM++) {
            boolean isLCM = true;
            for (int i = 0; i < numbers.length; i++) {
                if (potentialLCM % numbers[i] != 0) {
                    isLCM = false;
                    break;
                }
            }
            if (isLCM)
                break;
        }

//        do {
//            boolean isLCM = true;
//            for (int i = 0; i < numbers.length; i++) {
//                if (potentialLCM % numbers[i] != 0){
//                    isLCM = false;
//                    break;
//                }
//            }
//            if (isLCM)
//                break;
//            potentialLCM++;
//        }
//        while (true);
        return potentialLCM;
    }
}
