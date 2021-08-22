print("""
*************************************
        ATM MAKİNESİ PROGRAMI
**************************************""")
print("""İşlemler:
1. Bakiye Sorgulama
2. Para Çekme
3. Para Yatırma
İşlam iptali için Q'ya basın...
****************************************""")
bakiye = 1000

while True:
    islem = input("İşlemi Seçiniz: ")
    if(islem == "q"):
        print("Yine Bekleriz...")
    elif(islem == "1"):
        print("Bakiyeniz: {} TL'dir.".format(bakiye))
    elif (islem == "2"):
        miktar = int(input("Ne kadara ihtiyacınız var? "))
        if (bakiye - miktar < 0):
            print("Böyle bir miktar giremezsiniz...")
        elif(bakiye - miktar > 0):
            print("Yeni bakiyeniz {} ".format(bakiye - miktar))
        continue
    elif (islem == "3"):
        miktar_new = int(input("Yatırmak istediğiniz miktarı girin:"))
        miktar_new += bakiye
        print("Yeni bakiyeniz {} ".format(miktar_new))
    else:
        print("Geçersiz buton!")
    break
