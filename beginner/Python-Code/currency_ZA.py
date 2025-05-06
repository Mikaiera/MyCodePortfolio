"""
Beginner program(3): Is a basic currency calculator. 
Takes users input and coverts it directly into the chosen currency but not back.
This explicitly converst the South African Rands to the other currencies (2023)
"""

print("\t============Welcome to the currency calculator==============.")

user_curr = float(input("How much money do you have in rands? R ")) #get users float input

#Formulas that convert the 
yen = round(user_curr*7.41, 2)
yuan = round(user_curr*0.38, 2)
euro = user_curr*0.050

dollar = user_curr*0.055
#convert the users amount into its equivalence in crypto currencies
bitcoin = user_curr*0.0000018678375470183684
dogecoin = user_curr*0.6833303979439004
ethereum1 = user_curr*0.000028730032004165303

#Display the users converted currency
print(f"\nYou have {yen} in Japanese ¥"
      f"\nYou have {yuan} in Chinese ¥"
      f"\nYou have {euro} in Euro's €"
      f"\nYou have {dollar} in American $")

#Diplay users currency converted into crypto currency
print(f"\nYou have {bitcoin} in Bitcoin BTC"
      f"\nYou have {dogecoin} in Dogecoin DOGE"
      f"\nYou have {ethereum1} in Ethereum ETH\n")