import math

def is_strong_number(num):
    return num == sum(math.factorial(int(digit)) for digit in str(num))

# Find and print all strong numbers between 1 and 5000
strong_numbers = [num for num in range(1, 5001) if is_strong_number(num)]
print(strong_numbers)