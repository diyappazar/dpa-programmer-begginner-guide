
def chkNum(sayi):
    if(sayi == 2):
        return False
    elif(sayi==1):
        return False
    else:
        for i in range(2,sayi):
            list1 = []
            list1.append(i)
            if(sayi % i == 0):
                return False
        list1 = tuple(list1)
        print(list1)
        print(type(list1))

while True:
    sayi = rand()
    if(sayi == "q"):
        print("Bye bitch")
    else:
        sayi = int(sayi)
        if(chkNum(sayi)):
            print("Yes this is prime pro")
        else:
            print("Go take algebra")