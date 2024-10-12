from typing import List


def duplicateZeros(self, arr: List[int]) -> None:
    """
    Do not return anything, modify arr in-place instead.
    """
    temp = []
    for num in arr:
        if num == 0:
            temp.append(0)
            temp.append(0)
        else:
            temp.append(num)
    for i in range(len(arr)):
        arr[i] = temp[i]