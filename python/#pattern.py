for i in range(0,3):
    for j in range (0,2-i):
        print(" ", end="")
    for k in range (0,i+1):
        print(k+1,end ="")
    for l in  reversed(range(0,i)):
        print(l+1,end="")
    print()
