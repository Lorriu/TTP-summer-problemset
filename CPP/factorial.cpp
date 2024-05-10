/*
    *   factorial.cpp
    *
    *   Define the function factorial() that takes an integer argument and
    *   returns the factorial of that number.
    *   The factorial of a number is the product of all positive integers
    *   less than or equal to that number.
    *   The factorial of 0 is 1.
    *   Hint: factorial can be calculated recursively.
*/
#include <iostream>
#include <string>

using namespace std;

long factorial(int num)
{
    // Write your code here

    return 0; // replace 0 with the correct return value
}

int main()
{
    cout << factorial(0) << endl; // 1
    cout << factorial(1) << endl; // 1
    cout << factorial(3) << endl; // 6
    cout << factorial(5) << endl; // 120
    cout << factorial(10) << endl; // 3628800
    return 0;
}