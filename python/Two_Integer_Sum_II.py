from typing import List

# Brute Force
def twoSum(self, numbers: List[int], target: int) -> List[int]:
    for i in range(len(numbers)):
        j = len(numbers) - 1
        while j > i:
            if numbers[i] + numbers[j] < target:
                break
            elif numbers[i] + numbers[j] > target:
                j -= 1
            else:
                return [i+1, j+1]

# Two Pointer
# def twoSum(self, numbers: List[int], target: int) -> List[int]:
#     i, j = 0, len(numbers) - 1
#     while i < j:
#         if numbers[i] + numbers[j] == target:
#             return [i+1, j+1]
#         elif numbers[i] + numbers[j] < target:
#             i += 1
#         else:
#             j -= 1
#   return []   # return empty list if no solution found