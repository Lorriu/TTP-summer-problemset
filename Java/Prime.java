/*
    *   Prime.java
    *   
    *   Define the boolean function isPrime() that takes an integer argument and
    *   returns true if it is a prime number, false if it's not.
    *   A prime number is a number that is only divisible by 1 and itself.
    *   A prime number cannot be negative, 0, or 1.
*/

public class Prime {
    public static boolean isPrime(int n) {
        // write your code here

        return 0; // replace 0 with the correct return value
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2)); // true
        System.out.println(isPrime(3)); // true
        System.out.println(isPrime(4)); // false
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(41)); // true
        System.out.println(isPrime(51)); // false
        System.out.println(isPrime(97)); // true
    }
}