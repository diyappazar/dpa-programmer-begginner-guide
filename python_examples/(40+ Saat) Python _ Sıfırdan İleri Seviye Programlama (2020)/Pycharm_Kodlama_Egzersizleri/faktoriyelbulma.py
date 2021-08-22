print("""
*************************************
        FAKTORİYEL BULMA
**************************************""")
print("""   Çıkmak için lütfen 'Q'ye basın        
***************************************""")
while True:
    sayı = input("Sayı:")
    if sayı == "q":
        print("Program sonlandırılıyor...")
        break
    else:
        sayı = int(sayı)
        faktoriyel = 1

        for i in range (2,sayı+1):
            print("Faktoriyel: {} Number: {}".format(faktoriyel, i))
            faktoriyel *= i
        print(faktoriyel)