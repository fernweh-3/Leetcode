from typing import List


def sortedSquares(self, nums: List[int]) -> List[int]:
    list = [num*num for num in nums]
    return sorted(list)