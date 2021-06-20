public class BinarySearch{

    public void binarySearch(int[] arr , int key) {
        int li = 0;
        int hi = arr.length-1;
        int mi = (li+hi)/2;
        int search = key;

        while (li <= hi) {
            if (arr[mi]==search) {
                System.out.println("Element found at " + mi + " index.");
                break;
            }
            else if(search > arr[mi]){
                li = mi+1;
            } 
            else {
                hi = mi-1;
            }
            mi = (li+hi)/2;
        }
        if (li>hi){
            System.out.println("Element not found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,10,25,50,52,62,79,82,91,99,150};
        int key = 99;
        BinarySearch obj = new BinarySearch();
        obj.binarySearch(arr, key);
    }
}