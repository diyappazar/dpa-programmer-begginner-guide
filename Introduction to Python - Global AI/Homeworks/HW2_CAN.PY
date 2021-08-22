import operator
grade = [[48,80,100],[70,20,80],[32,45,65],[21,34,56],[13,25,48]]
name =["Diyap Can","Alara Yıldız","Mehmet Akın","Danyal Akar","Yakup Gökalp"]
b=0
tot_grad = []
total = 0
for i in range(0,5):
    for i in range(len(grade[i])):
             total += grade[b][i]
    total //= 3
    tot_grad.append(total)
    total = 0
    b += 1
dic = {name[i]: tot_grad[i] for i in range(len(tot_grad))}
dict( sorted(dic.items(), key=operator.itemgetter(1),reverse=True))
maxmKey = max(dic, key=dic.get)
print(dic)
print(f"Tebrikler {maxmKey} kazandın!")
