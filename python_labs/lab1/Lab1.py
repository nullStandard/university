# second task
print("Second task:\n\nHello world")
#third task
def foo1(num1, num2):
    key = True
    if num1 > 0 and num2 > 0:
        if num1 % num2 != 0:
            key = False
    else:
        raise ValueError("One of the numbers have the negative sign or zero")
    return key

print("\nThird task: ")
first = int(input("\nEnter first number: "))
second = int(input("Enter second number: "))
print(foo1(first, second))

#fourth task
def foo2(num1, num2):
##    for i in range(num1, num2+1):
##        key = 2
##        j = 0 # флаг
##        while key**2 <= i and j != 1:
##            if i%key == 0:
##                j = 1
##            key += 1
##        if j == 0:
##            array.append(i)
##    return array
    if (num1<0 or num2<0):
        raise ValueError('number must be non-negative')
    array=[]
    ertest=False
    for i in range(num1, num2+1):
        test=True
        for j in range(2, int(i/2)):
            if(foo1(i, j)):
                test=False
        if(test):
            array.append(i)
            ertest=True
    if(ertest):
        return array
    else:
        raise ValueError('no simple digits')
  
print("\nFourth task: ")
first = int(input("\nEnter first number: "))
second = int(input("Enter second number: "))
print(foo2(first, second))


#fifth task
print("Second task:\n")
arr1=['a', ['c', 1, 3], ['f', 7, [4, ['4']]], [{'lalala': 111}]]
print(arr1)
arr2=[]
def foo3(spysok):
    for i in range(0, len(spysok)):
        if(isinstance(spysok[i], list)):
            foo3(spysok[i])
        else:
            arr2.append(spysok[i])

foo3(arr1)
print("\n",arr2)

