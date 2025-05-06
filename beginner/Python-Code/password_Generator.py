import random

#basicially shuffles through the string module 
def generate_a_pass(string):
    tempList = list(string)#list with all the string constants
    random.shuffle(tempList)#shuffles through the string constants
    "".join(tempList)#converts the list to string
    
#where the main program of the string
#generate a random uppercase character A-Z(Ascii)   
uppercase1 = chr(random.randint(65,90))
uppercase2 = chr(random.randint(65,90))
#generate a random lowercase charcater a-z(Ascii)
lowercase1 = chr(random.randint(97,122))
lowercase2 = chr(random.randint(97,122))
#generate a random punctuation sign
punctuation1 = chr(random.randint(33,45))
punctuation2 = chr(random.randint(33,45))
#generate a random digit between 0-9(Ascii)
digit1 = chr(random.randint(48,57))
digit2 = chr(random.randint(48,57))

#creates a order in which the string is randomised
password = uppercase1  + digit1 + lowercase1 + uppercase2 + lowercase2 + punctuation2 +  digit2 + punctuation1 
print(password)#displays the randomly generated password
