#calculate pension age 

import mysql.connector
from datetime import date, timedelta
from dateutil.relativedelta import relativedelta

pensionAge=60

def connDB():
  mydb = mysql.connector.connect(
      host="localhost",
      user="saman",
      password="pass",
      database="students"
    )

  if mydb.is_connected():
      print("Connected to MySQL database")
  return mydb

def dbDetails():
  conn=connDB()
  mycursor = conn.cursor()
  mycursor.execute("SELECT * FROM student")
  rows = mycursor.fetchall()
  mycursor.close()
  conn.close() 
  return rows

def writeToDB(rtrDate,bDay):
  conn=connDB()
  mycursor = conn.cursor()
 
  sql = "UPDATE student set `rtrDate` = (%s) where bDay = (%s)"
  mycursor.execute(sql, (rtrDate,bDay))
  conn.commit()

  mycursor.close()
  conn.close() 

arr=dbDetails()

for row in arr:
  firstName=row[0]
  lastName=row[1]
  major=row[2]
  bDay=row[3]

  pensionDate=bDay + timedelta(365.25*pensionAge)

  print("First Name is",firstName,"and the birthday is",bDay)
  print("Retiring on",pensionDate)
  remainingTime = relativedelta(pensionDate, date.today())

  writeToDB(pensionDate,bDay)

  if pensionDate < date.today():
    print(firstName,"is already retired")
  else: 
    print("Remaining Time",f"{remainingTime.years} years, {remainingTime.months} months, {remainingTime.days} days")
  print("")