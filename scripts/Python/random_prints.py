import sys 
import datetime
from math import pi

#Get the python version
print("The Python Version is " + sys.version)

#Current date and time
now = datetime.datetime.now()
print("Current date and time : " + now.strftime("%Y-%m-%d %H:%M:%S"))

#Calculate area of a circle
r = float(input("Input the radius of the circle : "))
area = pi * r**2
print("The area of the circle with radius " + str(r) + " is: " + str(round(area,2)))

#Print the name in the reverse order
fname = input("Input your First Name : ")
lname = input("Input your Last Name : ")
print("Hello  " + lname + " " + fname)

#Lists vs Tuples
values = input("Input some comma seprated numbers : ")
list = values.split(",")
tuple = tuple(list)
print('List : ',list)
print('Tuple : ',tuple)