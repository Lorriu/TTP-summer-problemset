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

        if (num == 0){
            return "0";
        }
        
        //using a stringBuilder instead of built in function
        StringBuilder stringBuilder = new StringBuilder();
        boolean isNegative = num < 0;
       
        //convert negative numbers
        if (isNegative){
            num = -num;
        }

        //String representation by digit
        while (num > 0){

            //convert digit to a character
            stringBuilder.insert(0, (char)('0' + num % 10));
            //remove the last digit
            num /= 10;
        }

        //add - back to negative number
        if (isNegative){
            stringBuilder.insert(0, '-');
        }

        return stringBuilder.toString(); // Modify this line to return the string representation of the integer
    }

    public static void main(String[] args) {
        // Test your code here
        System.out.println(intToString(123)); // Expected output: "123"
        System.out.println(intToString(-123)); // Expected output: "-123"
        System.out.println(intToString(0)); // Expected output: "0"
        System.out.println(intToString(123456789)); // Expected output: "123456789"
    }
}