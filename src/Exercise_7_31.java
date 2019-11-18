public class Exercise_7_31 {
    public static void main(String[] args) {
        int[] list1 = {1,5,16,61,111};
        int[] list2 = {2,4,5,6};
        int[] list3 = merge(list1,list2);

        // Display merged list
        System.out.println("The merged list is");
        for (int e :
                list3) {
            System.out.println(" " + e);
        }
        System.out.println();
    }

    // merges two lists into a new list
    public static int[] merge(int[] list1, int[] list2){
        int[] list3 = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++)
            list3[i] = list1[i];

        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            list3[j] = list2[i];
        }

        sort(list3);

        return list3;
    }

    // sort a list in ascending order
    public static void sort(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min){
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}
