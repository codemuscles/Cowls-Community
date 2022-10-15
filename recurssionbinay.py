# -*- coding: utf-8 -*-
"""
Created on Fri Sep 23 23:41:31 2022

@author: HP
"""

def binary_search(l,x,start,end):
    #Base case: 1 ELement
    if start==end:
        if l[start]==x:
            return start
        else:
            return -1
    else:
        # divide the array into halves
        mid=int((start+end)/2)
        if l[mid]==x:
            return mid
        elif l[mid]>x:
            # left half
            return binary_search(l, x, start,mid-1)
        else:
            # right half 
            return binary_search(l, x, mid+1, end)
    
l=[20,25,45,60,90]
x=int(input("Enter search key:"))
index=binary_search(l, x, 0, len(l)-1)

if index==-1:
    print(x,"Not found")
else:
    print(x,"IS found at position",index+1)
        
    