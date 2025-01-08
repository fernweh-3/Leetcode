from typing import List


def encode(self, strs: List[str]) -> str:
    res =""
    for s in strs:
        res += f"{len(s):03}" + s
    return res

def decode(self, s: str) -> List[str]:
    i = 0
    res=[]
    while i<len(s):
        length = int(s[i:i+3])
        i+=3
        res.append(s[i:i + length])
        i+=length
    return res
