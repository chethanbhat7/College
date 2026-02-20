a=int(input())
b=int(input())
c=int(input())


if(a>b and a>c):
    print("Big:",a)
elif(b>c and b>a):
    print("Big:",b)
else:
    print("Big:",c)