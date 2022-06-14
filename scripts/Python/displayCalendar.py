#This prints the calendar of a given month and year
import calendar

y = int(input("Input the year : "))
m = int(input("Input the month : "))

if m in range(1,12):
    print("\n")
    print(calendar.month(y, m))
    print("\n")
else: 
    print("Enter a valid month")