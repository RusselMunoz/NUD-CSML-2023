# if elif else
curyear = int(input("Enter current year: "))
birthyear = int(input("Enter birth year: "))
age = curyear - birthyear
if age >= 30:
    print("You are millenial", age)
elif age >= 18:
    print("You are Gen Z,", age)
else:
    print("You Minor", age)