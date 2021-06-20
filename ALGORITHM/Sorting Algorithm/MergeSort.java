class MergeSort {

    int[] arr;
    int[] tempArr;
    int length;

    public void mergeSort(int[] intputArr) {
        this.arr = intputArr;
        this.length = intputArr.length;
        this.tempArr = new int[intputArr.length];
        divideArray(0, length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public void divideArray(int li, int hi) {
        if (li < hi) {
            int mid = li + (hi - li) / 2;
            divideArray(li, mid);
            divideArray(mid + 1, hi);

            mergeArray(li, mid, hi);
        }
    }

    public void mergeArray(int li, int mid, int hi) {

        for (int i = li; i <= hi; i++) {
            tempArr[i] = arr[i];
        }
        int i = li;
        int j = mid + 1;
        int k = li;

        while (i <= mid && j <= hi) {
            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = tempArr[i];
            i++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] intputArr = { 10, 20, 45, 285, 0, 56, 1, 5, 2, 9, 2, 26, 46 };
        MergeSort obj = new MergeSort();
        obj.mergeSort(intputArr);
    }

}
