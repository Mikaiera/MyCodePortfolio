from random import shuffle , choice
import string

#this is where the generator will get its input/password requirements
passCharacters = list(string.ascii_uppercase +string.ascii_lowercase +string.digits+ string.punctuation)

def generator():
    #get the password length from the user 
    user = int(input("Input the length of your password: "))

    #shuffle the order of the characters/requirements
    shuffle(passCharacters)
    #list that stores the password
    password = []
    #loop that iterates the input amount of time
    for i in range(user):
        #picks the random characters and adds them to the list above
        password.append(choice(passCharacters))
    #this will shuffle through the password list to further randomise it
    shuffle(password)
    #converts the password to string and displays the generated password
    print("".join(password))
generator()#returns the defined function