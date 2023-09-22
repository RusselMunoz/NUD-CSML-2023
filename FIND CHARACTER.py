# determine the index of a character
text = input("Enter a string: ")
char = input("Find: ")
for x in range(len(text)):
    if text[x] == char:
        print(char, "is at index", x)