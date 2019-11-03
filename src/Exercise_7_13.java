public class Exercise_7_13 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6};

        System.out.println(list[getRandom(list)]);
    }

    public static int getRandom(int... numbers){
        return (int)(Math.random()*numbers.length);
    }
}
