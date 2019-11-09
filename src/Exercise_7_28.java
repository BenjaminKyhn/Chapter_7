public class Exercise_7_28 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        combinations(list);
    }

    public static void combinations(int[] array) {
        // Print combination 1.. but then what??
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

    }
}
