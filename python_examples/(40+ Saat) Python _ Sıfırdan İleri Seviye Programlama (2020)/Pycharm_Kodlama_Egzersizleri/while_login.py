print("""
********************
  Kullanıcı Girişi
********************""")
sys_kullanici = "murat"
sys_parola = "12345"
sayac_giris = 3

while True:
    kullanici_adı = input("Kullanıcı Adını:")
    parola = input("Parola:")
    print("Giriş Hakkınız:", sayac_giris)
    if(kullanici_adı != sys_kullanici and parola == sys_parola):
        print("Kullanıcı adınız hatalı")
        sayac_giris-= 1
        print("Giriş Hakkınız:", sayac_giris)
    elif(kullanici_adı == sys_kullanici and parola != sys_parola):
        print("Parolanız hatalı")
        sayac_giris-= 1
        print("Giriş Hakkınız:",sayac_giris)
    elif (kullanici_adı != sys_kullanici and parola != sys_parola):
        print("Herşey hatalı kardeş")
        sayac_giris-= 1
        print("Giriş Hakkınız:",sayac_giris)
    else:
        print("Başarılı!")
    if sayac_giris == 0:
        print("Hakkınız bitti...")
        break