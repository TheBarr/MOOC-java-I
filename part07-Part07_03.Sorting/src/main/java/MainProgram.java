import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};

        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest_num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest_num > array[i]) {
                smallest_num = array[i];
            }
        }
        return smallest_num;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i ++){
            swap(array, indexOfSmallestFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
    }
}
