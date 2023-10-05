# Input a binary number as a string
binary_str = input("Enter a binary number: ")

# Split the binary string into integer and fractional parts (if present)
integer_part, fractional_part = binary_str.split('.', 1) if '.' in binary_str else (binary_str, '0')

# Initialize the decimal result for both integer and fractional parts to 0
decimal_integer = 0
decimal_fractional = 0

# Iterate through the integer part of the binary string from left to right
for digit in integer_part:
    decimal_integer = decimal_integer * 2 + int(digit)

# Iterate through the fractional part of the binary string from left to right
for i, digit in enumerate(fractional_part):
    decimal_fractional += int(digit) * (2 ** -(i + 1))

# Combine the integer and fractional parts to get the final decimal value
decimal = decimal_integer + decimal_fractional

print("Decimal equivalent:", decimal)
