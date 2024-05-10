/*
    *   Name: ReverseArray.java
    *
    *   Given an ArrayList of integers, write a function that returns nothing,
    *   but reverses the order of the elements in the ArrayList.
    *   For example, if the ArrayList is [1, 2, 3, 4, 5, 6, 7, 8, 9],
    *   after the function has been called, the ArrayList should be [9, 8, 7, 6, 5, 4, 3, 2, 1].
    *   Constraints: Do not create a new ArrayList, and do not import Collections.
*/
import java.util.ArrayList;

public class ReverseArray {
    // Write your function here


    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int x = 0;
        while (x < 9) {
            numbers.add(++x);
        }
        // Call your function, passing in the numbers ArrayList as an argument
        // Write your function call here



        // Do not modify the code below
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.size() - i != numbers.get(i)) {
                System.out.println("Incorrect");
            }
        }
        
    }
}