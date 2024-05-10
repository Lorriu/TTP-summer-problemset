/*
    *   Name: IntToString.java
    *   
    *   Given the function header, define the function intToString that converts an integer to a string.
    *   The function should return the string representation of the integer without using any built-in type casting functions.
    *   Reminder: Integers can be negative.
*/

public class IntToString {
    public static String intToString(long num) {
        // Write your code here

        return ""; // Modify this line to return the string representation of the integer
    }

    public static void main(String[] args) {
        // Test your code here
        System.out.println(intToString(123)); // Expected output: "123"
        System.out.println(intToString(-123)); // Expected output: "-123"
        System.out.println(intToString(0)); // Expected output: "0"
        System.out.println(intToString(123456789L)); // Expected output: "123456789"
    }
}