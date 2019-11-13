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
                // Make a temporary array and grow it
                int[] temp = new int[distinctArray.length+1];
                // Copy distinctArray to temp
                System.arraycopy(distinctArray, 0, temp, 0, distinctArray.length);
                // Insert the number in temp at the last index
                temp[temp.length-1] = list[i];
                // Copy the elements from temp to distinctArray
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
