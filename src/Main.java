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

    /**
     * This method calculates the nth Fibonacci number.
     * It uses a recursive approach.
     * Time complexity: O(2^n), due to redundant calculations.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * This method calculates a^n using recursion.
     * Time complexity: O(n), since it makes n recursive calls.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a^n.
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    /**
     * This method prints an array in reverse order using recursion.
     * Time complexity: O(n), where n is the number of elements.
     *
     * @param arr The input array.
     * @param n The number of elements in the array.
     */
    public static void printReverse(int[] arr, int n) {
        if (n == 0) return;
        System.out.print(arr[n - 1] + " ");
        printReverse(arr, n - 1);
    }

    /**
     * This method checks if a string consists only of digits.
     * Time complexity: O(n), where n is the length of the string.
     *
     * @param s The input string.
     * @param index The current character index.
     * @return true if all characters are digits, false otherwise.
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }


    public static void main(String[] args) {
        // Example calls for each function
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Min: " + findMin(arr, arr.length));
        System.out.println("Average: " + findAverage(new int[]{3, 2, 4, 1}, 4));
        System.out.println("Is Prime (7): " + isPrime(7, 6));
        System.out.println("Factorial (5): " + factorial(5));
        System.out.println("Fibonacci (5): " + fibonacci(5));
        System.out.println("Power (2^10): " + power(2, 10));
        System.out.print("Reverse Array: ");
        printReverse(new int[]{1, 4, 6, 2}, 4);
        System.out.println("\nIs All Digits (123456): " + isAllDigits("123456", 0));
    }
}
