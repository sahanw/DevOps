import time
from matplotlib import pyplot as plt

n = int(input())
x = []
x.append(n)
while(n > 1):
    time.sleep(1)
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
