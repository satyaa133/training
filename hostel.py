name=input("Enter your name: ")
age=int(input("Enter your age: "))
percentage=float(input("Enter your percentage: "))
distance=float(input("Enter your distance from home to college: "))
income=float(input("Enter your annual family income: "))

print("Name:", name)
print("Age:", age)
print("Percentage:", percentage)
print("Distance from home to college:", distance)   
print("Annual family income:", income)

if(percentage>=90 and income<=500000 and distance>=100):
    print("You are eligible for premium single room accommodation.")
elif(percentage>=75 and income<=800000 and distance>=50):
    print("You are eligible for standard double room accommodation.")
elif(percentage>=60 and distance>=25):
    print("You are eligible for triple sharing room accommodation.")
elif(percentage<60 or distance<20):
    print("You are currently on waiting list.")
else:
    print("You are not eligible for any accommodation.")


    