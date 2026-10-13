"""
1. ValueError
ValueError occurs when the type is correct but the value is inappropriate.
Example
age = int("abc")
Here, int() expects a string containing a valid number, but "abc" cannot be converted to an integer.
try:
    age = int("abc")
except ValueError:
    print("Invalid value. Please provide a number.")
Output:
Invalid value. Please provide a number.
"""
age=int("abc");