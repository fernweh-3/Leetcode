from typing import List


def findNumbers(self, nums: List[int]) -> int:
    length_list = [len(str(num)) for num in nums]
    return sum(1 for length in length_list if length%2 == 0)