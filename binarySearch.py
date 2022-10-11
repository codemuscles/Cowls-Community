# def binarySearch(list, n):
#     start = 0
#     end = len(list) -1
#     mid = 0

#     while start <=end:
#         mid = (start+end)//2
#         if list[mid] < n:
#             low = mid +1
#         elif list[mid] > n:
#             end = mid -1
#         else:
#             return mid
#     return -1

# list =[10,12,14,52,45,64]
# n = 45
# result = binarySearch(list,n)

# print(result)


from tracemalloc import start


def binary_search(list, n):  
    start = 0  
    end = len(list) - 1  
    mid = 0  
  
    while start <= end:  
        # for get integer result   
        mid = (end + start) // 2  
  
        # Check if n is present at mid   
        if list[mid] < n:  
            start = mid + 1  
  
        # If n is greater, compare to the right of mid   
        elif list[mid] > n:  
            end = mid - 1  
  
        # If n is smaller, compared to the left of mid  
        else:  
            return mid  
  
            # element was not present in the list, return -1  
    return -1  
  
  
# Initial list1  
list = [22, 43, 64, 72, 35, 34, 100]  
n = 72
  
# Function call   
result = binary_search(list, n)  
  
if result != -1:  
    print("Element is present at index", str(result))  
else:  
    print("Element is not present in list1")  