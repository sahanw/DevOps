# Given is an array of latency values, a time window and threshold. 
# This script will output the time we should throw an alert 
# The point in time is represented by the index of the latency value when the threshold is crossed for the given time span 

#Sample Input:
#latency = [1,2,4,4,3,7,8,9,6,7]
#window = 3
#threshold = 5 
#Expected output: 7 

latency = [1,2,4,4,3,7,8,0,9,6,7]

window = 3 
threshold = 5 
alertCount=0

for l in range(0, len(latency)-window+1):
    for i in range(l, l+window):
        if(latency[i]>=threshold):
            alertCount=alertCount+1
    if(alertCount>=window):
            print(i)
            break
    else: 
        alertCount=0