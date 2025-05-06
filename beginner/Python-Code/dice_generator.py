#python libraries
from random import randint
from time import sleep

#message displayed when the program is run
print("Welcome to the die roller!Every second a different outcome will be displayed!")

#get user input
user = input("To start the program enter 1.To exit/close the program 0 or x: ")

#numbers which the computer will run through to generate die rolls displayed
computer = randint(1,6) 

while True:
    if user == "1":
        print("Generating die rolls: \n")
        for i in range(6):
            if computer == 1:
                print("[--------]\
                    \n[        ]\
                    \n[    *   ]\
                    \n[        ]\
                    \n[--------]")
            sleep(1)#used this as a way to pause the generation of the different die outcomes

            if computer == 2:
                print("[--------]\
                    \n[       *]\
                    \n[        ]\
                    \n[*       ]\
                    \n[--------]")
            sleep(1)

            if computer == 3:
                print("[--------]\
                    \n[       *]\
                    \n[   *    ]\
                    \n[*       ]\
                    \n[--------]")
            sleep(1)

            if computer == 4:
                print("[--------]\
                    \n[*      *]\
                    \n[        ]\
                    \n[*      *]\
                    \n[--------]")
            sleep(1)

            if computer == 5:
                print("[--------]\
                    \n[*      *]\
                    \n[    *   ]\
                    \n[*      *]\
                    \n[--------]")
            sleep(1)

            if computer == 6:
                print("[--------]\
                    \n[*      *]\
                    \n[*      *]\
                    \n[*      *]\
                    \n[--------]")
                    
            computer = randint(1,6)#repeated at the end again as a way to generate another random number that will be displayed
            print("\n")

    user = input("To continue running the program enter 1.To exit/close the program 0 or x: ")
    
    if user =="0" or user == "x":       
        print("The die roll generator has been closed!")
        break