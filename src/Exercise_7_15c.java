import java.util.Arrays;

public class Exercise_7_15c {
    public static void main(String[] args) {
        int[] list = {1,2,3,2,1,6,3,4,5,2};
        System.out.println(Arrays.toString(eliminateDuplicates(list)));
    }
    public static int[] eliminateDuplicates(int[] list){
        int[] distinctArray = new int[0];
        for (int i = 0; i < list.length; i++) {
            if (linearSearch(distinctArray, list[i]) == -1){
                int[] temp = new int[distinctArray.length+1];
                System.arraycopy(distinctArray, 0, temp, 0, distinctArray.length);
                temp[temp.length-1] = list[i];
                distinctArray = temp;
            }
        }
        return distinctArray;
    }

    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
}
