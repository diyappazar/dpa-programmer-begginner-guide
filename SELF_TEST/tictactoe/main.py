import random
gameScale = [[0, 0, 0],[0, 0, 0],[0, 0, 0]]
gameState = True
Player = "null"
Computer = "null"
def welcomeMessage(x="null"):
    print("#########################")
    print("→ Hey welcome {}".format(x))
    print("#########################")
def questEnt(ansQuest):
        ansQuest = int(ansQuest)
        if(ansQuest == 0):
            print("#########################")
            print("   LET THE GAME BEGIN")
            print("#########################")
        elif(ansQuest == 1):
            print("Bye!")
        else:
            print("wrong charachter try again")
def movXoro(ansLett):
    if(ansLett == "O" or ansLett == "o"):
        print("#########################")
        print("You have choosed 'O'")
        ansLettComp = "X"
        return ansLettComp
    elif(ansLett == "X" or ansLett == "x"):
        print("#########################")
        print("You have choosed 'X'")
        ansLettComp = "O"
        return ansLettComp
    else:
        print("You have entered a wrong charachter")
def drawScale():
    print("   0  1  2")
    count = -1
    for row in gameScale:
        count += 1
        print(count,row)
def AskPlayer():
    drawScale()
    x = input("Which row would you like to put your {} ?\n".format(ansLett))
    y = input("Which column would you like to put your {} X?\n".format(ansLett))
    putXorO(int(x), int(y))
def putXorO(x,y):
    if(x>2 or y>2):
        AskPlayer()
    else:
        if gameScale[x][y] == 0:
            gameScale[x][y] = Player
            randPutXor()
        else:
            print("Please choose another slot")
            AskPlayer()
def randPutXor():
        pathX = random.randint(0, 2)
        pathY = random.randint(0, 2)

        if gameScale[pathX][pathY] == 0:
            gameScale[pathX][pathY] = Computer
        else:
            randPutXor()
def checkGame():
    if gameScale[0][0] == Player and gameScale[0][1] == Player and gameScale[0][2] == Player:
        return "You won!"
        gameState = False
    elif gameScale[1][0] == Player and gameScale[1][1] == Player and gameScale[1][2] == Player:
        return "You won!"
        gameState = False
    elif gameScale[2][0] == Player and gameScale[2][1] == Player and gameScale[2][2] == Player:
        return "You won!"
        gameState = False
    elif gameScale[0][0] == Player and gameScale[1][0] == Player and gameScale[2][0] == Player:
        return "You won!"
        gameState = False
    elif gameScale[0][1] == Player and gameScale[1][1] == Player and gameScale[2][1] == Player:
        return "You won!"
        gameState = False
    elif gameScale[0][2] == Player and gameScale[1][2] == Player and gameScale[2][2] == Player:
        return "You won!"
        gameState = False
    elif gameScale[0][0] == Player and gameScale[1][1] == Player and gameScale[2][2] == Player:
        return "You won!"
        gameState = False
    elif gameScale[0][2] == Player and gameScale[1][1] == Player and gameScale[2][0] == Player:
        return "You won!"
        gameState = False
    elif gameScale[0][0] == Player and gameScale[1][2] == Player and gameScale[2][0] == Player:
        return "You won!"
        gameState = False

    if gameScale[0][0] == Computer and gameScale[0][1] == Computer and gameScale[0][2] == Computer:
        return "Computer won!"
        gameState = False
    elif gameScale[1][0] == Computer and gameScale[1][1] == Computer and gameScale[1][2] == Computer:
        return "Computer won!"
        gameState = False
    elif gameScale[2][0] == Computer and gameScale[2][1] == Computer and gameScale[2][2] == Computer:
        return "Computer won!"
        gameState = False
    elif gameScale[0][0] == Computer and gameScale[1][0] == Computer and gameScale[2][0] == Computer:
        return "Computer won!"
        gameState = False
    elif gameScale[0][1] == Computer and gameScale[1][1] == Computer and gameScale[2][1] == Computer:
        return "Computer won!"
        gameState = False
    elif gameScale[0][2] == Computer and gameScale[1][2] == Computer and gameScale[2][2] == Computer:
        return "Computer won!"
        gameState = False
    elif gameScale[0][0] == Computer and gameScale[1][1] == Computer and gameScale[2][2] == Computer:
        return "Computer won!"
        gameState = False
    elif gameScale[0][2] == Computer and gameScale[1][1] == Computer and gameScale[2][0] == Computer:
        return "Computer won!"
        gameState = False
print("""###########################################################
               XOX THINGY THAT I HARDLY MADE 
############################################################""")
nameID = input("""Hello what is your name?
Enter here please: """)
welcomeMessage(nameID)
print("""How to play?

    1. The game is played on a grid that's 3 squares by 3 squares.

    2. If you choose X, your friend (or the computer in this case) is O. Players take turns putting their marks in empty squares considered.

    3. The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner.

    4. When all 9 squares are full, the game is over. If no user has 3 marks in a row, the game ends in a tie.
""")
ansQuest = input("Would you like to play the game? (YES:0 NO:1 QUIT:Q)\n→")
questEnt(ansQuest)
ansLett = input("What would you like to choose X or O?\n →")
print("""Your enemy the computer of course will have '{}'
####################################
""".format(movXoro(ansLett)))
Player = ansLett
Computer = movXoro(ansLett)
while gameState == True:
    AskPlayer()
    print(checkGame())


