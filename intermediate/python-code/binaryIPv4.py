"""
Validates an IPv4 address string and converts it to its binary representation.

The function checks if the input string is a valid IPv4 address (between 7 and 15 characters,
with 3 periods, and each octet is a number between 1 and 255).  If valid, it converts each octet
to its 8-bit binary representation and concatenates them with periods.  If invalid, it returns
an error message.
"""
def validation(checkValue):
    #set function variables (by creating an array)
    numberList=[]#array where the binary is stored
    valid = True#Testing of values
    startValue = 0 #starting point is here
    fullStopCount = 0#number of fullstops in the value 

    if len(checkValue)> 6 and len(checkValue)< 16:
        while valid == True:
            newValue = ""#storing individual string values it finds
            if checkValue.find('.',startValue+1) != -1:
                endValue = checkValue.find('.',startValue +1)
                fullStopCount += 1
            else:
                endValue = len(checkValue)
                valid = False
            #create new value for each fullstop
            for i in range(startValue,endValue):
                newValue += checkValue[i]
            #check if the value is a digit between 1-255 before adding to the list otherwise return message to the user
            if newValue.isdigit():
                newValue = int(newValue)
                if newValue > 0 and newValue < 256:
                    #convert thr value ti binary and add to the list
                    numberList.append(convertToBinary(newValue))
                else:
                    return "value us not between 1and255"
            else:
                return "value does not conatain a nuber oor incorrect IPv4 syntax" 

            #set the new start position in the string to check for the next fullstop 
            startValue = endValue + 1
        #create the new converted binary ipv4 address from the list , adding the fullestops and returning the result to the main program
        if fullStopCount !=3:
            return "Invalid IPv4 Syntax"
        else:
            convertedNumber = ""
            for binaryValue in numberList:
                convertedNumber += binaryValue

                if fullStopCount!=0:
                    convertedNumber+= '.'
                    fullStopCount-= 1     
        return convertedNumber
    else:
        return "Incorrect Length"

#function to convert to function
def convertToBinary(conNumber):
    conNumber = int(conNumber)
    binaryValue = ''
    for calculate in range(7,-1,-1):
        testValue = 2** calculate
        if conNumber>=testValue:
            binaryValue += "1"
            conNumber = conNumber - testValue
        else:
            binaryValue += "0"
    return binaryValue

#MAIN program 
while True:
    value = input("Enter a valid ipv4 adress or x to exit: ")
    if value.isdigit == 'x':
        break
    else:
        print(validation(value))