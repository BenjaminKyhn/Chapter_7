import java.util.Scanner;

public class Exercise_7_26 {
    public static void main(String[] args) {
        System.out.println("Enter the length of an array and then that many integers: ");
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int[] list = new int[arrayLength];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("The list is " + (isSorted(list) ? "already sorted" : "not sorted") + " in ascending order" );;
    }

    public static boolean isSorted(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            if (list[i] > list[i+1])
                return false;
        }
        return true;
    }
}
