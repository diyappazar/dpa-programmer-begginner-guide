import random
from time import sleep

class gameMessage:
    def helloMes(self, name):
        print("#########################")
        print(f"→ Hey welcome {name} 🙋🏻‍")
        print("#########################")
        sleep(1)
        print("Let's get started!")

    def lastMessage(self):
        print("############################################################")
        print(
            """How to play? \n\n\t1. Your goal is to guess the word to save the player from being hanged. Fill in the blanks by guessing one letter at a time to see if it’s in the word. \n\t2. If you have guessed correctly, you may save the man. Try to guess the word or phrase when you have enough correct letters on the board. \n\t3. Look at the blank spaces and try to guess the word, remember to keep the theme in mind – it may help you solve the puzzle! \n\nIn 6 seconds game will continue.""")
        sleep(2)
        print("In 4 seconds game will continue..")
        sleep(2)
        print("In 2 seconds game will continue...")
        sleep(2)
        print("I assume you read the instructions, yes it needs fast-reading 101 lecture... 😜")
        print("############################################################")

    def scale(self):
        sleep(4)
        print("""
           😃
           /|\  Look how happy he is, try not to kill him!
           //
        """)
        print("############################################################")
class gamePlay:
    scale = ["""
    --------""", """
       +---+
       |   |
       O   |
           |
           |
           |
    --------""", """
       +---+
       |   |
       O   |
       |   |
           |
           |
    --------""","""
       +---+
       |   |
       O   |
      /|   |
           |
           |
    --------""", """
       +---+
       |   |
       O   |
      /|\  |
           |
           |
    --------""","""
        +---+
        |   |
        O   |
        /|  |
        /   |
            |
        --------
             """, """
       +---+
       |   |
       O   |
      /|   |
      //   |
           |
    --------"""]
    wordList = ["New York","Ankara","Adana","Berlin","Hatay","Zurafa","Fil"]
    def __init__(self):
        scale = random.choice(self.wordList)
        print("Guess the word: {}".format(len(scale)*" _"))
        findLetter = []
        wrongLetter = 0
        won = 0
        while True:
            letter = input("Type a letter or the word:  ")
            if(len(letter)>1):
                if (letter.lower() == scale.lower()):
                    won = 1 
                else:
                    print("Sallama 🙄")
                    wrongLetter+=1
                    print(self.scale[wrongLetter])
                    if wrongLetter == 6:
                        print("YOU LOST! He is dead now his family will die from kahır 😥")
                        sleep(1)
                        break
            else:
                if (letter.lower() in scale.lower()):
                    if (letter.lower() in findLetter):
                        print("Bunu yazmıştın 😐")
                    else:
                        findLetter.append(letter.lower())
                        renderText = ""
                        for i in range(0,len(scale)): 
                            if (scale[i].lower() in findLetter):
                                renderText += " " + scale[i]
                            else:
                                renderText += " _"
                        print(renderText)

                        if (len(findLetter) == len(scale)):
                            won = 1
                else:
                    wrongLetter+=1
                    print(self.scale[wrongLetter])
                    if wrongLetter == 6:
                        print("YOU LOST! He is dead now his family will die from kahır 😥\n")
                        sleep(1)
                        break
            if won == 1:
                print("YOU WON !😎")
                sleep(2)
                break
while True:
    print("""###########################################################
                HANGMAN GAME 
############################################################""")
    name = input("""Hello what is your name?
    Enter here please: """)
    player = gameMessage()
    player.helloMes(name)
    player.lastMessage()
    player.scale()
    play = gamePlay()
