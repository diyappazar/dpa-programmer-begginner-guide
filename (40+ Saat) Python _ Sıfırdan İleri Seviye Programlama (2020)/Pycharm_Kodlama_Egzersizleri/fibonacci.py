print("""
*************************************
        Fibonacci Serisi 
**************************************""")
print("""   Çıkmak için lütfen 'Q'ye basın        
***************************************""")
a = 1
b = 1
fibonacci = [a,b]
for i in range(20):
    a,b = b,a+b
    print("a: {} b: {}".format(a,b))
    fibonacci.append(b)
print(fibonacci)