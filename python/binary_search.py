from typing import List


def search(self, nums: List[int], target: int) -> int:
    l = 0
    r = len(nums) - 1
    while l <= r:  # 3. l == r is the last element, so we need to check if l == r
        # 1. (l+r)/2 may cause overflow, so we move half of the distance to the right side from the left side
        mid = l + (r - l) // 2
        if target == nums[mid]:
            return mid
        elif target > nums[mid]:
            l = mid + 1  # 2. we need to move the left pointer to the right side of mid, since mid has been checked
        else:
            r = mid - 1  # 2. we need to move the right pointer to the left side of mid, since mid has been checked
    return -1

#
# # Recursive
#     def binary_search(self, l: int, r: int, nums: List[int], target: int) -> int:
#         if l > r:
#             return -1
#         mid = l + (r - l) // 2
#         if target == nums[mid]:
#             return mid
#         elif target > nums[mid]:
#             return binary_search(mid + 1, r)
#         else:
#             return binary_search(l, mid - 1)
#
#     def search(self, nums: List[int], target: int) -> int:
#         return binary_search(0, len(nums) - 1)
#


# class Solution:
# 最后，l 指向的索引是第一个比目标值 target 大的元素。适用于找到最后一个等于目标值的索引。
# 排除过程中更倾向于检查右侧部分，最终返回的索引需要 l - 1。
#     def search(self, nums: List[int], target: int) -> int:
#         l, r = 0, len(nums)
#
#         while l < r:
#             m = l + ((r - l) // 2)
#             if nums[m] > target:
#                 r = m
#             elif nums[m] <= target:
#                 l = m + 1
#         return l - 1 if (l and nums[l - 1] == target) else -1

    # class Solution:
# 最后, l 指向第一个大于等于 target 的索引。适用于找到第一个等于目标值的索引。
# 排除过程中更倾向于检查左侧部分，最终直接返回 l。
#     def search(self, nums: List[int], target: int) -> int:
#         l, r = 0, len(nums)
#
#         while l < r:
#             m = l + ((r - l) // 2)
#             if nums[m] >= target:
#                 r = m
#             elif nums[m] < target:
#                 l = m + 1
#         return l if (l < len(nums) and nums[l] == target) else -1