from typing import List


def checkIfExist(self, arr: List[int]) -> bool:
    for i in range(len(arr)):
        for j in range(len(arr)):
            if arr[i]*2 == arr[j] and i!=j:
                return True
    return False

# def checkIfExist(self, arr: List[int]) -> bool:
#         cnt = Counter(arr)
#         if cnt[0] > 1:
#             return True
#
#         for k, _ in cnt.items():
#             if k != 0 and cnt[2*k] > 0:
#                 return True
#         return False
# cnt = Counter(arr) creates a frequency count of all elements in the array arr.
# The Counter object cnt stores how many times each number appears in the list.
# For example, if arr = [1, 2, 2, 4], cnt would be Counter({2: 2, 1: 1, 4: 1}).

#     def checkIfExist(self, arr: List[int]) -> bool:
#         arrDic = {}
#         for i in arr:
#             if i * 2 in arrDic or i / 2 in arrDic:
#                 return True
#             arrDic[i] = 1
#         return False
# arrDic = {} creates an empty dictionary.
# The for loop iterates through the elements in arr.
# If i * 2 or i / 2 is in arrDic, then return True.
# Otherwise, add i to arrDic.