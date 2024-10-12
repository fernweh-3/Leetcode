from typing import List


def removeElement(self, nums: List[int], val: int) -> int:
    new, original, count = 0,0,0
    while original < len(nums):
        if nums[original] == val:
            original +=1
            count+=1
        else:
            nums[new] = nums[original]
            original += 1
            new += 1
    return len(nums) - count


# def removeElement(self, nums: List[int], val: int) -> int:
#     j : int = 0
#     for i in range(len(nums)):
#         if(nums[i] != val):
#             nums[j] = nums[i]
#             j += 1
#     return j