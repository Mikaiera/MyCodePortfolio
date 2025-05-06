from random import randint

#the list that the game will operate off
t = ["rock","paper","scissor"]

#randomises which item the computer will choose
computer = t[randint(0,2)]

#set the players status before the game
player = False

while True :
    #get the input from the user and set the user to true
    player = input("Input either:rock or paper or scissors: ")
    #condtionals/game outcomes
    if player == computer:
        print("Its a tie!")
    elif player == "rock":
        if computer == "paper":
            print("You just got origamied !" ,computer,"covered the",player,".")#condtions based of what the computer value is 
        else:
            print("You ROCK!!! ",player,"smashed",computer,".")#whats is displayed if the user input is
    elif player == "paper":
        if computer == "scissors":
            print("You lose",computer,"cuts",player)
        else:
            print("Winner you just made dome pulp!",player,"covers",computer,".")
    elif player == "scissors":
        if computer == "rock":
            print("Hows life as a pancake now?",computer,"smashes",player,".")
        else:
            print("Hows life as a pancake now?",computer,"smashes",player,".")
    else:
        print("Input valid value.Check your spelling and casing!")
#end the game by resetting the players status and game
    print("\n")
    player = False
    computer = t[randint(0,2)]