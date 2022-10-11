#fun with calender part 4
import calendar
def check_valid_date(date,month,year,leap):
  if leap:
    if month==2:
      if date<30:
        return True
      else:
        return False
    else:
      if month<8:
        if month%2==1:
          if date<32:
            return True
          else:
            return False 
        else:
          if date<31:
            return True
          else:
            return False
  else:
    if month==2:
      if date<29:
        return True
      else:
        return False
    else:
      if month<8:
        if month%2==1:
          if date<32:
            return True
          else:
            return False 
        else:
          if date<31:
            return True
          else:
            return False
def get_day(day_index):
  list_of_days=["monday","tuesday","wednesday","thursday","friday","saturday","sunday"]
  return list_of_days[day_index]            
def check_leap(year):
  if year%100==0:
    if year%400==0:
      return True
    else:
      return False
  else:
    if year%4==0:
      return True
    else:
      return False
while(1):
  year=int(input("enter the year ( from 1970):"))
  if year<1970:
    print("enter a year starting from 1970") 
  else:
    break
while(1):
  month=int(input("enter month (1-12):"))
  if month<=12 and month>0:
    break   
  else:
    print("enter a valid month(1-12):")
leap=check_leap(year)
while(1):
  date=int(input("enter date:"))
  if (date>=0) :
   break
   if(check_valid_date(date,month,year,leap)):
     print("True")   
  else:
    print("enter a valid date:")  
day_index=calendar.weekday(year,month,date)
day=get_day(day_index)
print(date,"/",month,"/",year,"falls on",day)