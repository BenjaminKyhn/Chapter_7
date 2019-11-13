import java.util.Arrays;

public class Exercise_7_15b {
    public static void main(String[] args) {
        int[] list = {1,2,3,2,1,6,3,4,5,2};
        System.out.println(Arrays.toString(eliminateDuplicates(list)));
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] distinctArray = new int[0];
        for (int i = 0; i < list.length; i++) {
            int tallet = list[i];
            boolean duplicateNumbers = false;
            for (int j = 0; j < list.length; j++) {
                if (tallet == list[j] && j != i){
                    duplicateNumbers = true;
                    break;
                }
            }
            if (!duplicateNumbers){
                int[] temp = new int[distinctArray.length+1];
                System.arraycopy(distinctArray, 0, temp, 0, distinctArray.length);
                temp[temp.length-1] = tallet;
                distinctArray = temp;
            }

        }
        return distinctArray;

    }

}