/*
    *   Name: reverseArray.cpp
    *
    *   Given an vector of integers, write a function that returns nothing,
    *   but reverses the order of the elements in the vector.
    *   For example, if the vector is {1, 2, 3, 4, 5, 6, 7, 8, 9},
    *   the function should modify the vector to be {9, 8, 7, 6, 5, 4, 3, 2, 1}.
    *   Constraints: Do not create any new vectors, arrays, or lists.
    *   Hint: The function should take a reference to a vector of integers as a parameter.
*/
#include <iostream>
#include <string>
#include <vector>

using namespace std;
// Write your function here


int main()
{
    vector<int> numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // Call your function, passing in the numbers vector
    // Write your function call here



    
    // Don't modify the following line
    for (int i = 0; i < numbers.size(); i++)
    {
        if (numbers.size() - i != numbers[i])
        {
            cout << "Incorrect" << endl;
        }
    }
    return 0;
}