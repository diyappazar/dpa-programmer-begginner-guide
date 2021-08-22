print("""***************************
HESAP MAKİNESİ PROGRAMI
İşlemler:
Press 1 for Summation
Press 2 for Division
Press 3 for Multiplication
Press 4 for Substraction

***************************""")
a = int(input("Birinci Sayı: "))
b = int(input("İkinci Sayı: "))
proc = int(input("Press to a given key for calculation:"))
if proc == 1:
    ret = a+b
    print("You choosed summation, your result is: {}".format(ret))
elif proc == 2:
    ret = a / b
    print("You choosed division, your result is: {}".format(ret))
elif proc == 3:
    ret = a * b
    print("You choosed multiplication, your result is: {}".format(ret))
elif proc == 4:
    ret = a - b
    print("You choosed substraction your result is: {}".format(ret))
else:
    print("You have entered something wrong!!!")





