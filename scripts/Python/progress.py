import time
import sys

for i in range(101):
    time.sleep(0.1)
    sys.stdout.write("\r%d%%" % i)
    percent = float(i)/100
    hashes = '#' * int(percent * 50)
    spaces = '-' * (50 - len(hashes))
    sys.stdout.write("\rPercent: [{0}] {1}%".format(
        hashes + spaces, int(percent * 100)))
    sys.stdout.flush()
