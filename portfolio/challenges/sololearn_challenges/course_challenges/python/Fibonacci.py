"""
    This program calculates and prints the n-th term of the Fibonacci sequence

    Completed 12/29/21
"""


num = int(input())

def fibonacci(n):
    num = 0
    if n <= 1:
        num = n
    else:
        num = fibonacci(n - 2) + fibonacci(n - 1)
    return num

for i in range(num):
    print(fibonacci(i))