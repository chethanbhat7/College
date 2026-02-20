n=int(input())

forn=n
nums=0
while(forn!=0):
    nums+=1
    forn=forn//10

sumofn=0
forn=n
while(forn!=0):
    dig=forn%10
    sq=1
    for i in range(nums):
        sq*=dig
    sumofn+=sq
    forn=forn//10
if n==sumofn:
    print("ArmStrong")
else:
    print("Not Armstrong")