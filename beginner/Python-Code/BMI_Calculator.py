print("Welcome to the bmi calculator!")

user_input= str(input("Enter y to start the program or x to close: "))
user_weight=float(input("\nFor weight in lbs press 1 or else enter your weight here(kg): "))
user_height=float(input("\nFor height in feet enter 1 for height in cm enter 2: "))

while user_input == "y":
    if user_height==1 or user_weight==1:
        
        user_weight1 = float(input("\nWeight in lbs: "))/2.205
        feet_height = float(input("Enter your height in feet : "))
        inch_height = float(input("Enter your the inches of your height: "))
        
        height_1 = feet_height/3.281 + inch_height/39.37
        BMI_1 = round(user_weight1/height_1**2)
        
        print(f"\nYour BMI is {BMI_1}")
        
    elif user_height==2:
        cm_height = float(input("Enter your height in cm: "))/100
        BMI_2 = round(user_weight/cm_height**2,2)
        print(f"\nYour BMI is {BMI_2}")
    
    elif user_height != 1 or user_height !=2 :
        print("Enter a valid height!")
        user_height=float(input("For height in feet enter 1 for height in cm enter 2: "))
else:
    exit()