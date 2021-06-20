import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1]; 
                j = j - 1;
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = { 4, 9, 5, 6, 8, 7, 3, 2, 1 };
        obj.insertionSort(arr);
    }

}
