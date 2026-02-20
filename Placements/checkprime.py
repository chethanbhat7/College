n=int(input())
got=False
for i in range(2,n):
    if n%i==0:
        print("false")
        got=True
        break
if(not got and n>0):    
    print("true")
else:
    print("lesser than 10")