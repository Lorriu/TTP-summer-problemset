/*
    *   Name: PalindromeNumber.java
    *   
    *   Define the function isPalindrome() that takes an integer argument and
    *   returns true if the number is a palindrome, and false otherwise.
    *   A palindrome is a number that reads the same forwards and backwards.
    *   For example, 121 is a palindrome, but 123 is not.
    *   Also, negative numbers cannot be palindromes.
    * 
    *   Constraints: Do not convert the integer to a string to solve this problem.
    *   Challenge: Try to solve this problem without allocating extra space.
    *   Hint: The numbers of digits in an integer can be calculated using:
    *   floor(log10(num)) + 1
*/
import static java.lang.Math.floor;
import static java.lang.Math.log10;

@SuppressWarnings("unused")
public class PalindromeNumber {
    // Write your function here

    //check if the reverse number and the orginal number match
    public static boolean isPalindrome(int n){

        //if number is less than 0 returns false
        if (n < 0){
            return false;
        }

        int reverse = 0;
        int number = n;

        while (n != 0) {

            //finding the last digit
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n/10;   
        }

        //check if reverse and number are the same 
        return (reverse == number); // if true returns 1
        
    }


    public static void main(String[] args) {
        // Call your function with the number you would like to check
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(43567));
        System.out.println(isPalindrome(34543));
    }
}