def prime_first(number):
    if number > 1:
        for i in range(2, number):
            if (number % i) == 0:
                break
        else:
            print(number)
def prime_second(number):
    if number > 1:
        for i in range(2, number):
            if (number % i) == 0:
                break
        else:
            print(number)
print("""***************************************
             PRIME OR NOT? 
***************************************""")
for i in range(0,1001):
    if i<500 and i>=0:
        prime_first(i)
    else:
        prime_second(i)
print("""***************************************
                  END 
***************************************""")

    
