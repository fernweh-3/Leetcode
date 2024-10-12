from typing import List


def removeDuplicates(self, nums: List[int]) -> int:
    count = 1
    flag = nums[0]
    for i in range(1,len(nums)):
        if nums[i] != flag:
            flag = nums[i]
            nums[count] = nums[i]
            count+=1
    return count

#     def removeDuplicates(self, nums: List[int]) -> int:
#         if not nums:
#             return 0
#
#         l = 0
#         for r in range(1, len(nums)):
#             if nums[r] != nums[l]:
#                 l += 1
#                 nums[l] = nums[r]
#
#         return l+1

#     def removeDuplicates(self, nums: List[int]) -> int:
#         index = 0
#         been = set()
#
#         for i in range(len(nums)):
#             if nums[i] not in been:
#                 nums[index] = nums[i]
#                 been.add(nums[i])
#                 index += 1
#
#         return index