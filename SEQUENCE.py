# count multiples of a number from sequence
num1 = int(input("Enter a number: "))
num2 = int(input("Count multiples of: "))
mul = 0

for x in range(1, num1 + 1):
        if x % num2 == 0:
                mul += 1
print (f"There are {mul} mutiples of {num2} in {num1}")
