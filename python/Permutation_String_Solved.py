# def checkInclusion(self, s1: str, s2: str) -> bool:
#     s1 = sorted(s1)
#     if len(s1) > len(s2):
#         return False
#     for i in range(len(s2)-len(s1)+1):
#         s2_sub = s2[i: i + len(s1)]
#         if s1 == sorted(s2_sub):
#             return True
#     return False

