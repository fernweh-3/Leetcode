from typing import List


def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    res = {}
    for string in strs:
        key = [0]*26
        for c in string:
            key[ord(c)-ord('a')]+=1
        if str(key) in res:
            res[str(key)].append(string)
        else:
            res[str(key)] = [string]
    return res.values()