'''The Collatz conjecture states that the orbit of every number under f eventually reaches 1. 
And while no one has proved the conjecture, it has been verified for every number less than 2 to the power 68. 
So if you're looking for a counterexample, you can start around 300 quintillion
'''

import time
from matplotlib import pyplot as plt

n = int(input())
x = []
x.append(n)
while(n > 1):
    time.sleep(0.1)
    if(n % 2 == 0):
        n = n//2
        x.append(n)
        print(n)
    else:
        n = (3*n) + 1
        x.append(n)
        print(n)
plt.plot(x, '-ok')
plt.show()