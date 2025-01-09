from typing import List


def evalRPN(self, tokens: List[str]) -> int:
        res = []
        for a in tokens:
            if a not in ['+', '-', '*','/']:
                res.append(a)
            else:
                right = int(res.pop())
                left = int(res.pop())
                if a == '+':
                    result = left+right
                elif a == '-':
                    result = left-right
                elif a == '*':
                    result = left*right
                elif a == '/':
                    result = left/right
                res.append(result)
        return int(res.pop())