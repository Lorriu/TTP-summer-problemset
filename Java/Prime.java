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

        //if n less than or equal to 1 false
        if (n <= 1)
            return false;

        //start at 2 and incrrement by 1 to check, until i is less n
        for (int i = 2; i < n; i++)
            //if n is divisble by i and there nothing left over then false
            if (n % i == 0)
                return false; // replace 0 with the correct return value

        return true;
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