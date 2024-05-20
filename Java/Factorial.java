/*
    *   Factorial.java
    *
    *   Define the function factorial() that takes an integer argument and
    *   returns the factorial of that number.
    *   The factorial of a number is the product of all positive integers
    *   less than or equal to that number.
    *   The factorial of 0 is 1.
    *   Hint: factorial can be calculated recursively.
*/

public class Factorial {
    public static long factorial(int n) {
        // write your code here
        if (n == 0) 
            return 1; 

        return n * factorial(n - 1); // replace 0 with the correct return value

    }

    public static void main(String[] args) {
        System.out.println(factorial(0)); // Expected output: 1
        System.out.println(factorial(1)); // Expected output: 1
        System.out.println(factorial(3)); // Expected output: 6
        System.out.println(factorial(5)); // Expected output: 120
        System.out.println(factorial(10)); // Expected output: 3628800
    }
}
