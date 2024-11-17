from typing import List


def twoSum(self, nums: List[int], target: int) -> List[int]:
    dif_dict = {target - nums[i]:i for i in range(len(nums))}
    for i,num in enumerate(nums):
        if num in dif_dict and i != dif_dict[num]:
            return [i, dif_dict[num]]

# it is hard to figure out the repeated element at first
# but using a dictionary is the fast way to solve this problem