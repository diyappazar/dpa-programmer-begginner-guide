import random
import time

print("""

SAYI TAHMİN OYUNU



1 ile 40 arasında bir sayı yaın

""")
resgele_sayi = random.randint(1,40)
tahmin_hakki = 7

while True:
    tahmin = int(input("Taminninz:"))

    if(tahmin<resgele_sayi):
        print("Bilgiler sorgulanıyor...")
        time.sleep(1)

        print("Yanlış")
        tahmin_hakki -= 1
    else:
        print("Bilgiler sorgulanıyor....")

        print(       time.sleep(1))
        print("Doğru!")
        break
    if(tahmin_hakki == 0 ):
        print("TAHMİN HAKKI BİTTİ",resgele_sayi)