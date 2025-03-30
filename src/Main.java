public class Main {

    /**
     * This method finds the minimum element in an array.
     * Time complexity: O(n), where n is the size of the array.
     * The algorithm processes each element once, leading to linear time complexity.
     *
     * @param arr The input array.
     * @param n The number of elements in the array.
     * @return The minimum element in the array.
     */
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    /**
     * This method calculates the average of elements in an array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the size of the array.
     *
     * @param arr The input array.
     * @param n The number of elements in the array.
     * @return The average of the array elements.
     */
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return ((findAverage(arr, n - 1) * (n - 1)) + arr[n - 1]) / n;
    }

    public static void main(String[] args) {
        // Example calls for each function
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Min: " + findMin(arr, arr.length));
        System.out.println("Average: " + findAverage(new int[]{3, 2, 4, 1}, 4));
    }
}
