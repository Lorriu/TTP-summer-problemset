"""
    *   Name: intToString.py
    *   
    *   Given the function header, define the function intToString that converts an integer to a string.
    *   The function should return the string representation of the integer without using any built-in type casting functions.
    *   Reminder: Integers can be negative.
"""

def intToString(num: int) -> str:
    ...
    # Write your code here
    
    
def main() -> None:
    print(intToString(123)) # Expected output: "123"
    print(intToString(-123)) # Expected output: "-123"
    print(intToString(0)) # Expected output: "0"
    print(intToString(123456789)) # Expected output: "123456789"
    
if __name__ == "__main__":
    main()