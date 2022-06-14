# Function to print permutations of string

def toString(List):
    return ''.join(List)

def permute(arr, l, r): #String, Starting Index, Length, 
    if l == r:
        print(toString(a))
    else:
        for i in range(l, r):
            arr[l], arr[i] = arr[i], arr[l]
            permute(arr, l+1, r)
            arr[l], arr[i] = arr[i], arr[l]  # backtrack

# Driver program to test the above function
string = "3456"
n = len(string)
a = list(string)

permute(a, 0, n)