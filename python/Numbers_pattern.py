# number pyramid pattern
r = int(input("Enter the no. of rows: "))
# for i in range(r):
#     print(" "*(r-i), end='')
#     for j in range(i+1):
#         print(j+1, end='')
#     print()

# Left right triangle patterns
# for i in range(r):
#     for j in range(i+1):
#         print(j+1, end=' ')
#     print()

# reverse triangle pattern

for i in range(r):
    print(" "*i, end='')
    for j in range(1,(r+1)-i):
        print(j,end='')
    print()


for i in range(r):
    print(' '*(r-i-1),end='')
    for k in range(1,i+2):
        print(k,end='')
    for l in range(i,0,-1):
        print(l,end='')
    print()


# def Check_Vow(string, vowels):
#     final = [e for e in string if e in vowels]
#     print(len(final))
#     print(final)

# vowels = 'AaEeIiOoUu'
# string = 'Hii I am Anurag Kumar.'
# Check_Vow(string, vowels)

# def reverse(s):
#     if len(s) == 0:
#         return s
#     else:
#         return(reverse(s[1:]) + s[0])

# print(reverse(string))