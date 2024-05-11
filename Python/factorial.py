"""
    *   factorial.py
    *
    *   Define the function factorial() that takes an integer argument and
    *   returns the factorial of that number.
    *   The factorial of a number is the product of all positive integers
    *   less than or equal to that number.
    *   The factorial of 0 is 1.
    *   Hint: factorial can be calculated recursively.
"""
def check(func):
    assert func(0) == 1
    assert func(1) == 1
    assert func(3) == 6
    assert func(5) == 120
    assert func(10) == 3628800
    print("PASSED")
    return func

@check
def factorial(num: int) -> int:
    ...
    # Write your code here
    

def main() -> None:
    ...
    print(factorial(0)) # 1
    print(factorial(1)) # 1
    print(factorial(3)) # 6
    print(factorial(5)) # 120
    print(factorial(10)) # 3628800

if __name__ == '__main__':
    main()