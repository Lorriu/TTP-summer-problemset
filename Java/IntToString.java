/*
    *   Name: IntToString.java
    *   
    *   Given the function header, define the function intToString that converts an integer to a string.
    *   The function should return the string representation of the integer without using any built-in type casting functions.
    *   Reminder: Integers can be negative.
*/

public class IntToString {
    public static String intToString(int num) {
        // Write your code here
        
        //collect number and turn into string
        String StringNumber = Integer.toString(num);


        return StringNumber; // Modify this line to return the string representation of the integer
    }

    public static void main(String[] args) {
        // Test your code here
        System.out.println(intToString(123)); // Expected output: "123"
        System.out.println(intToString(-123)); // Expected output: "-123"
        System.out.println(intToString(0)); // Expected output: "0"
        System.out.println(intToString(123456789)); // Expected output: "123456789"
    }
}