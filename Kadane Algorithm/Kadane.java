/**
 * Kadane :: Used to find max subarray
 */
public class Kadane {
    public void kadane(int[] arr) {
        int maxEndHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndHere = Math.max(arr[i], maxEndHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        System.out.print(maxSoFar);
    }

    public static void main(String[] args) {
        Kadane obj = new Kadane();
        int[] arr = { 1, -2, -4, 6, -8, 6, 10, 9 };
        obj.kadane(arr);
    }
}