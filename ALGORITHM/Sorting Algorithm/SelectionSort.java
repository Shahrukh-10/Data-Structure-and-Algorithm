public class SelectionSort {
    public void selectionSort(int[] arr) {
        int temp = 0;
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    /*
     * Compare to compares string lexicographically if s1 > s2 then return 1 if s1 =
     * s2 then return 0 if s1 < s2 then return -1
     */

    public void selectionSort(String[] arr) {
        String temp = "";
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = { 12, 15, 1, 5, 155, 8, 65, 2, 6, 896, 21, 2121, 235, 145 };
        String[] player = { "shahrukh", "messi", "yasar", "abd", "pranjal", "kunal", "dembele", "ubaid", "pranav",
                "nazam", "aqib", "muzammil" };
        obj.selectionSort(arr);
        System.out.println();
        obj.selectionSort(player);
    }

}
