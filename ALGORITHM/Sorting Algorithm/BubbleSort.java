public class BubbleSort {

    // BubbleSort for integer

    public void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {

            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length; i++) {

            int flag = 0;
            /*
             * Compare to compares string lexicographically if s1 > s2 then return 1 if s1 =
             * s2 then return 0 if s1 < s2 then return -1
             */
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = { 10, 20, 45, 285, 0, 56, 1, 5, 2, 9, 2, 26, 46 };
        String[] player = { "shahrukh", "messi", "yasar", "abd", "pranjal", "kunal", "dembele", "ubaid", "pranav", "nazam", "aqib", "muzammil" };
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(arr);
        obj.bubbleSort(player);
    }
}
