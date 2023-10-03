# Input a binary number as a string
binary_str = input("Enter a binary number: ")

# Initialize the decimal result to 0
decimal = 0

# Iterate through the binary digits from left to right
for digit in binary_str:
    decimal = decimal * 2 + int(digit)

print("Decimal equivalent:", decimal)