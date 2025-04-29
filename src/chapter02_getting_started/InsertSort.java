package chapter02_getting_started;

import java.util.Arrays;

public class InsertSort {

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are greater than 'key' one position ahead
            // to make space for inserting 'key' at its correct sorted position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,4,6,1,3};
        InsertSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
