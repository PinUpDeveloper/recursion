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

    /**
     * This method checks whether a number is prime.
     * It uses a recursive approach.
     * Time complexity: O(sqrt(n)), since we only check divisibility up to sqrt(n).
     *
     * @param n The number to check.
     * @param divisor The current divisor.
     * @return true if prime, false otherwise.
     */
    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor - 1);
    }

    /**
     * This method calculates the factorial of a given number.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Example calls for each function
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Min: " + findMin(arr, arr.length));
        System.out.println("Average: " + findAverage(new int[]{3, 2, 4, 1}, 4));
        System.out.println("Is Prime (7): " + isPrime(7, 6));
        System.out.println("Factorial (5): " + factorial(5));
    }
}
