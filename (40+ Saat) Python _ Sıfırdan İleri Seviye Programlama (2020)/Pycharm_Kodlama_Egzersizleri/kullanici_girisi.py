sys_username = "can"
sys_pass = "123"
newEntUser = input("Enter your user name: ")
newEntPass = input("Enter your password: ")
if (sys_pass != newEntPass and newEntUser ==sys_username):
    print("Your password is wrong!")
elif (sys_username != newEntUser and newEntPass == sys_pass):
    print("Your username is wrong!")
elif (sys_pass != newEntPass and newEntUser != newEntUser):
    print("Check your informations...")
else:
    print("Welcome {}".format(newEntUser))