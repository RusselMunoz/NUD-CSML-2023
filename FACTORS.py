# display the factors of a give number.
num = int(input("Enter a number: "))

for x in range(1,num + 1):
    if num % x:
        continue
    print(x)

