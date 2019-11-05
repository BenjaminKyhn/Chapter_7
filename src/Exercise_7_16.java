public class Exercise_7_16 {
    public static void main(String[] args) {
        int[] hugeArray = new int [100000000];
        for (int i = 0; i < hugeArray.length; i++) {
            hugeArray[i] = i+1;
        }

        // Search for 1
        System.out.println("Search for 1: ");
        System.out.println("Linear method: " + linearSearchTime(hugeArray, 1) + " nanoseconds");
        System.out.println("Binary method: " + binarySearchTime(hugeArray,1) + " nanoseconds");
        System.out.println();

        // Search for 25.000.000
        System.out.println("Search for 25000000: ");
        System.out.println("Linear method: " + linearSearchTime(hugeArray, 25000000) + " nanoseconds");
        System.out.println("Binary method: " + binarySearchTime(hugeArray,25000000) + " nanoseconds");
        System.out.println();

        // Search for 50.000.000
        System.out.println("Search for 50000000: ");
        System.out.println("Linear method: " + linearSearchTime(hugeArray, 50000000) + " nanoseconds");
        System.out.println("Binary method: " + binarySearchTime(hugeArray,50000000) + " nanoseconds");
        System.out.println();

        // Search for 75.000.000
        System.out.println("Search for 75000000: ");
        System.out.println("Linear method: " + linearSearchTime(hugeArray, 75000000) + " nanoseconds");
        System.out.println("Binary method: " + binarySearchTime(hugeArray,75000000) + " nanoseconds");
        System.out.println();

        // Search for 100.000.000
        System.out.println("Search for 100000000: ");
        System.out.println("Linear method: " + linearSearchTime(hugeArray, 100000000) + " nanoseconds");
        System.out.println("Binary method: " + binarySearchTime(hugeArray,100000000) + " nanoseconds");
        System.out.println();
    }

    // Method for calculating search time using linear search
    public static long linearSearchTime(int [] array, int key){
        long startTime = System.nanoTime();
        linearSearch(array, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        return executionTime;
    }

    // Method for calculating search time using binary search
    public static long binarySearchTime(int [] array, int key){
        long startTime = System.nanoTime();
        binarySearch(array, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        return executionTime;
    }

    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < mid)
                high = mid - 1;
            else if (key == mid)
                return mid;
            else
                low = mid + 1;
        }
        return -low -1;
    }
}
