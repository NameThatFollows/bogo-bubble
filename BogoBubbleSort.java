import java.util.Arrays;
import java.util.Random;

public class BogoBubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        long start = System.nanoTime();
        sort(array);
        long end = System.nanoTime();
        System.out.println("TIME: " + (end - start)/ (double) 1000000000 + "s");

    }

    public static void sort(int[] array) {
        Random random = new Random();
        do {
            for (int i = 1; i < array.length; i++) {
                if (random.nextBoolean()) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        } while (!checkSort(array));
    }

    public static boolean checkSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }

        return true;
    }

}