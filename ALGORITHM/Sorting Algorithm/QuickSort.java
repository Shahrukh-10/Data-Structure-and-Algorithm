public class QuickSort {

    public int partition(int[] arr, int low, int high) {
        int li = low;
        int hi = high;
        int pivot = arr[(li + hi) / 2];

        while (li <= hi) {
            while (arr[li] < pivot) {
                li++;
            }
            while (arr[hi] > pivot) {
                hi--;
            }
            if (li <= hi) {
                int temp = arr[li];
                arr[li] = arr[hi];
                arr[hi] = temp;
                li++;
                hi--;
            }
        }
        return li;
    }

    public void recursionQuickSort(int[] arr, int low, int high) {
        int pi = partition(arr, low, high);

        if (low < pi - 1) {
            recursionQuickSort(arr, low, pi - 1);
        }
        if (pi < high) {

            recursionQuickSort(arr, pi, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 25, 2, 3, 5, 6, 12, 4 };
        int low = 0;
        int length = arr.length;
        int high = length - 1;

        QuickSort obj = new QuickSort();
        obj.recursionQuickSort(arr, low, high);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
