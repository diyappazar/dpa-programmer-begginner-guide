import math
import canmath
from time import sleep

def operatorCheck():
    oper = input("Enter the operator:")
    return oper
history= []
print("""
-----------------------------------------------------------------
                           CALCULATOR
-----------------------------------------------------------------""")
print("""     1. x+y   2. x-y    3. x*y    4. x/y
     5. x^y   6. sqr()  7. log10()  8. Ceiling 9. Independent() 
-----------------------------------------------------------------""")
print("    → Independent will allow you to make multiple \n      operations.\n    → You can see the last process by entering 'h' \n    → You can enter 'q' to quit from the program \n-----------------------------------------------------------------")
while True:
    oper = operatorCheck()
    if(oper == "1"):
         x = int(input("Enter the first number: "))
         y = int(input("Enter the second number: "))
         res = canmath.sum(x,y)
         print("Your result is getting prepared.")
         sleep(1)
         print("Your result is getting prepared..")
         sleep(1)
         print("Your result is getting prepared...")
         sleep(1)
         print("\nRESULT: {}".format(res))
         history.append(res)
    elif(oper == "2"):
         x = int(input("Enter the first number: "))
         y = int(input("Enter the second number: "))
         res = canmath.neg(x,y)
         print("Your result is getting prepared.")
         sleep(1)
         print("Your result is getting prepared..")
         sleep(1)
         print("Your result is getting prepared...")
         sleep(1)
         print("\nRESULT: {}".format(res))
         history.append(res)
    elif (oper == "9"):
         x = input("Enter all equation:  ")
         pros = eval(x)
         print("\nRESULT: {}".format(res))
         history.append(res)
    elif (oper == "3"):
        x = int(input("Enter the first number: "))
        y = int(input("Enter the second number: "))
        res = canmath.mul(x, y)
        print("Your result is getting prepared.")
        sleep(1)
        print("Your result is getting prepared..")
        sleep(1)
        print("Your result is getting prepared...")
        sleep(1)
        print("\nRESULT: {}".format(res))
        history.append(res)
    elif (oper == "4"):
        x = int(input("Enter the first number: "))
        y = int(input("Enter the second number: "))
        res = canmath.div(x, y)
        print("Your result is getting prepared.")
        sleep(1)
        print("Your result is getting prepared..")
        sleep(1)
        print("Your result is getting prepared...")
        sleep(1)
        print("\nRESULT: {}".format(res))
        history.append(res)
    elif (oper == "5"):
        x = int(input("Enter the first number: "))
        y = int(input("Enter the second number: "))
        res = canmath.pow(x, y)
        print("Your result is getting prepared.")
        sleep(1)
        print("Your result is getting prepared..")
        sleep(1)
        print("Your result is getting prepared...")
        sleep(1)
        print("\nRESULT: {}".format(res))
        history.append(res)
    elif (oper == "6"):
        x = int(input("Enter the number: "))
        res = canmath.sqrt(x)
        print("Your result is getting prepared.")
        sleep(1)
        print("Your result is getting prepared..")
        sleep(1)
        print("Your result is getting prepared...")
        sleep(1)
        print("\nRESULT: {}".format(res))
        history.append(res)
    elif (oper == "7"):
        x = int(input("Enter the number: "))
        res = canmath.log10(x)
        print("Your result is getting prepared.")
        sleep(1)
        print("Your result is getting prepared..")
        sleep(1)
        print("Your result is getting prepared...")
        sleep(1)
        print("\nRESULT: {}".format(res))
        history.append(res)
    elif (oper == "8"):
        x = float(input("Enter the number: "))
        res = canmath.ceil(x)
        print("Your result is getting prepared.")
        sleep(1)
        print("Your result is getting prepared..")
        sleep(1)
        print("Your result is getting prepared...")
        sleep(1)
        print("\nRESULT: {}".format(res))
        history.append(res)
    elif(oper == "q"):
        print("Ok bb.")
        break
    elif(oper == "h"):
        print(history)
    else:
        print("You have entered a wrong operator..")


