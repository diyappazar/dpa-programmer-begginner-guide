import random
scale = [[], [], []]
for d in range(0, 3):
    for i in range(0, 3):
        sayi = random.randint(0, 99999)
        if sayi == 1:
            print("nope")
        elif sayi == 2:
            print("nope")
        else:
            for a in range(2, sayi):
                if ((sayi % a) == 0):
                    break
        scale[d].append(sayi)
print("     0      1      2")
count = -1
for row in scale:
    count += 1
    print(count, row)
