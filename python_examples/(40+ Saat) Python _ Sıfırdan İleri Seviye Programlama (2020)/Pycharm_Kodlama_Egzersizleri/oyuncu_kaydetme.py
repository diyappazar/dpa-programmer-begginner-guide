print("Oyuncu Kaydetme Programı")
ad = input("Adınızı giriniz: ")
soyad = input("Soyadınızu giriniz: ")
takim = input("Takımınızı giriniz: ")

bilgiler = [ad,soyad,takim]
print("Bilgiler Kaydediliyor.....")
print("Oyuncunun adı: {}\nOyuncunun Soyadı: {}\nOyuncunun Takımı: {} ".format(bilgiler[0],bilgiler[1], bilgiler[2]))
print("Bilgiler Kaydedildi!")