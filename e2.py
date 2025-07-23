def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

# List to store the first 100 prime numbers
primes = []
num = 2

# Loop to find the first 100 primes
while len(primes) < 100:
    if is_prime(num):
        primes.append(num)
    num += 1

# Print the first 100 prime numbers
print("First 100 prime numbers:")
print(primes)