def isValid(self, s: str) -> bool:
        stack = list()
        pair_dict = {')': '(', '}': '{', ']' :'['}
        for a in s:
            if a in ['(', '{', '[']:
                stack.append(a)
            elif a in [')','}',']']:
                if len(stack) == 0:
                    return False
                if stack[len(stack)- 1] == pair_dict[a]:
                    stack.pop()
                else:
                    return False
        return len(stack) == 0


# def isValid(self, s: str) -> bool:
#     stack = []
#     closeToOpen = { ")" : "(", "]" : "[", "}" : "{" }
#
#     for c in s:
#         if c in closeToOpen:
#             if stack and stack[-1] == closeToOpen[c]:
#                 stack.pop()
#             else:
#                 return False
#         else:
#             stack.append(c)
#
#     return True if not stack else False

    # def isValid(self, s: str) -> bool:
    #     while '()' in s or '{}' in s or '[]' in s:
    #         s = s.replace('()', '')
    #         s = s.replace('{}', '')
    #         s = s.replace('[]', '')
    #     return s == ''