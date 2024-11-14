def isAnagram(self, s: str, t: str) -> bool:
    s_dict = {}
    t_dict = {}
    for i in range(len(s)):
        if s[i] in s_dict:
            s_dict[s[i]] += 1
        else:
            s_dict[s[i]] = 1
    for i in range(len(t)):
        if t[i] in t_dict:
            t_dict[t[i]] += 1
        else:
            t_dict[t[i]] = 1
    return t_dict == s_dict


    # # Hash Table
    # def isAnagram(self, s: str, t: str) -> bool:
    #     if len(s) != len(t):
    #         return False
    #
    #     countS, countT = {}, {}
    #
    #     for i in range(len(s)):
    #         countS[s[i]] = 1 + countS.get(s[i], 0)
    #         countT[t[i]] = 1 + countT.get(t[i], 0)
    #     return countS == countT


# def isAnagram(self, s: str, t: str) -> bool:
#     if len(s) != len(t):
#         return False
#
#     count = [0] * 26
#     for i in range(len(s)):
#         count[ord(s[i]) - ord('a')] += 1 # ord() returns the Unicode code point for a one-character string
#         count[ord(t[i]) - ord('a')] -= 1
#
#     for val in count:
#         if val != 0:
#             return False
#     return True