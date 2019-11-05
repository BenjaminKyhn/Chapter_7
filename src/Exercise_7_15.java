// HELP NEEDED

import java.util.Arrays;

public class Exercise_7_15 {
    public static void main(String[] args) {
        int[] list = {1,2,3,2,1,6,3,4,5,2};
        System.out.println(Arrays.toString(eliminateDuplicates(list)));
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] distinctList = new int[list.length];
        int i = 0;
        for (int e = list[i]; i < list.length; i++) {
            if (linearSearch(distinctList, e) == -1)
                distinctList[i] = e;
        }
        return distinctList;
    }

    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
}
