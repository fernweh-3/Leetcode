from typing import List


def hasDuplicate(self, nums: List[int]) -> bool:
    nums_set = {i for i in nums}
    return len(nums_set) != len(nums)

# Hash Set Length
# def hasDuplicate(self, nums: List[int]) -> bool:
#     return len(set(nums)) < len(nums)
