from typing import List


def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
    res = []
    for i in range(len(temperatures)):
        day = 0
        count = 0
        for j in range(i+1, len(temperatures)):
            if temperatures[j]>temperatures[i]:
                count+=1
                day += count
                res.append(day)
                break
            elif j == len(temperatures) - 1:
                res.append(day)
            else:
                count+=1
    res.append(0)
    return res