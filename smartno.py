def is_prime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True


def is_square(n):
    if n < 1:
        return False
    root = 1
    while root * root < n:
        root += 1
    return root * root == n


def analyze_numbers(n):
    prime_count = 0
    square_count = 0
    fizzbuzz_sum = 0

    for x in range(1, n + 1):
        labels = []

        if x % 3 == 0 and x % 5 == 0:
            labels.append("FizzBuzz")
            fizzbuzz_sum += x
        elif x % 3 == 0:
            labels.append("Fizz")
        elif x % 5 == 0:
            labels.append("Buzz")

        if is_prime(x):
            labels.append("Prime")
            prime_count += 1

        if is_square(x):
            labels.append("Square")
            square_count += 1

        print(f"{x} {' '.join(labels)}" if labels else x)

    print(f"Total Primes: {prime_count}")
    print(f"Total Squares: {square_count}")
    print(f"Sum of FizzBuzz Numbers: {fizzbuzz_sum}")


if __name__ == "__main__":
    n = int(input().strip())
    analyze_numbers(n)
