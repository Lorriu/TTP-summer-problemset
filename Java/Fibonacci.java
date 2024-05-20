/*
    *   Name: Fibonacci.java
    *   
    *   Define the function fibonacci() that takes an integer argument and
    *   returns an array of integers containing the first n Fibonacci numbers.
    *   The first two Fibonacci numbers are 0 and 1, and each subsequent number
    *   is the sum of the previous two.
    *   For example, if the function is called with an argument of 10, the
    *   return value should be an array containing the first 10 Fibonacci numbers:
    *   {0, 1, 1, 2, 3, 5, 8, 13, 21, 34}.
    * 
    *   Suggestions: Consider using recursion to solve this problem.
*/

public class Fibonacci {
    // Write your function here
    static int fibonacci(int fibNumber){

    //if int collected is lessthan or equal to 1 return int
    if (fibNumber <= 1)
        return fibNumber;
    
    //Return recursive call
    return fibonacci(fibNumber - 1) + fibonacci(fibNumber - 2);

    }

    public static void main(String[] args) {
        // Call your function with the number of
        // Fibonacci numbers you would like to generate
        int N = 10;

        //the interger starts at 0 and as long as i is less N increment + 1 through the numbers
        for (int i = 0; i < N; i++){
            System.out.print(fibonacci(i) + " ");
        }
        
    }
}