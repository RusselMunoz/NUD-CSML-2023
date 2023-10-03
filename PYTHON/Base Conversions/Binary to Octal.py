# Read the binary number from the user
binary_number = input("Enter a binary number: ")

# Pad the binary number with leading zeros to make it a multiple of 3
if len(binary_number) % 3 != 0:
    binary_number = "0" + binary_number
    # Initialize an empty string to store the octal result
    octal_result = ""
    
    # Process groups of three binary digits from right to left
    for i in range(0, len(binary_number), 3):
         group = binary_number[i:i+3]  # Get a group of three binary digits
         decimal_value = int(group, 2)  # Convert the group to decimal
         octal_digit = oct(decimal_value)[2:]  # Convert decimal to octal (remove the '0o' prefix)
         octal_result = octal_digit + octal_result  # Append octal digit to the left of the result
         
# Output the octal result
print("Octal result:", octal_result)