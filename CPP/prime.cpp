/*
    *   prime.cpp
    *   
    *   Define the boolean function isPrime() that takes an integer argument and
    *   returns true if it is a prime number, false if it's not.
    *   A prime number is a number that is only divisible by 1 and itself.
    *   A prime number cannot be negative, 0, or 1.
*/
#include <iostream>
#include <string>

using namespace std;

bool isPrime(int num)
{
    // Write your code here
    
    return 0; // replace 0 with the correct return value
}

int main()
{
    cout << isPrime(2) << endl; // true
    cout << isPrime(3) << endl; // true
    cout << isPrime(4) << endl; // false
    cout << isPrime(5) << endl; // true
    cout << isPrime(11) << endl; // true
    cout << isPrime(41) << endl; // true
    cout << isPrime(51) << endl; // false
    cout << isPrime(97) << endl; // true
    return 0;
}