from typing import List


def validMountainArray(self, arr: List[int]) -> bool:
    if len(arr) < 3:
        return False
    if len(arr) == 3 and not(arr[0]<arr[1] and arr[1]>arr[2]):
        return False
    max_index = arr.index(max(arr))
    if max_index ==0 or max_index == len(arr) - 1:
        return False
    for i in range(max_index):
        if arr[i] >= arr[i+1]:
            return False
    for j in range(max_index, len(arr) - 1):
        if arr[j] <= arr[j+1]:
            return False
    return True

#     def validMountainArray(self, arr: List[int]) -> bool:
#         if len(arr)<3:
#             return False
#         if arr[0]>=arr[1]:
#             return False
#         if arr[-1]>=arr[-2]:
#             return False
#         increasing=True
#         for i in range(2,len(arr)):
#             if increasing:
#                 if arr[i]<=arr[i-1]:
#                     increasing=False
#             else:
#                 if arr[i]>=arr[i-1]:
#                     return False
#         return len(arr)>2
# introduced a boolean variable increasing to keep track of whether the array is increasing or decreasing.