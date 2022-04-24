# Function to print permutations of string

def palindrome(str):
    if len(str) ==0:
        print("Please Define the String")
        exit(1)
    elif len(str) == 1:
        print( str + "is a palindrome")
    else:
        if str == str[::-1]:
            print(str + "is a palindrome")
        else:
            print(str + "is NOT a palindrome")

str = "saippuakivikauppias"
palindrome(str)