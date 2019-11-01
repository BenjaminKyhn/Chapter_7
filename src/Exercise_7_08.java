public class Exercise_7_08 {
    public static void main(String[] args) {
        int[] list1 = {0,1,2,3,4,5,6};
        double[] list2 = {0,1,2,3,4,5,6};
        System.out.println(average(list1));
        System.out.println(average(list2));
    }

    public static int average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }

    public static double average(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
}
