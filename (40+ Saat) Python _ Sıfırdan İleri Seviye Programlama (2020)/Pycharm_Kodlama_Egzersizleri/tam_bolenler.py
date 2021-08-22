print("\U0001F600")
def tam_bolenler(sayı):
    tambolenler = []

    for i in range(1,sayı):
        if(sayı%i==0):
            tambolenler.append(i)
    return tambolenler
while True:
    sayı = input("Sayı: ")
    if (sayı == "q"):
        print("bye.")
        break
    else:
        sayı = int(sayı)
        print("Tam bölenler:",tam_bolenler(sayı))
