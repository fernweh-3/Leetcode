
def isPalindrome(self, s: str) -> bool:
    l, r = 0, len(s) - 1
    while l < r:
        while l < r and not self.alphaNum(s[l]):
            l += 1
        while r > l and not self.alphaNum(s[r]):
            r -= 1
        if s[l].lower() != s[r].lower():
            return False
        l, r = l + 1, r - 1
    return True

# a helper function to check if a character is alphanumeric
def alphaNum(self, c: str) -> bool:
    return (ord('A') <= ord(c) <= ord('Z') or
            ord('a') <= ord(c) <= ord('z') or
            ord('0') <= ord(c) <= ord('9'))

# use isalnum() to check if a character is alphanumeric
def isPalindrome(self, s: str) -> bool:
    left, right = 0, len(s) - 1
    while left<right:
        while left<right and not s[left].isalnum():
            left += 1
        while left<right and not s[right].isalnum():
            right -= 1
        if s[left].lower() != s[right].lower():
            return False
        left, right = left + 1, right - 1
    return True

# reverse the string and compare
# def isPalindrome(self, s: str) -> bool:
#         newStr = ''
#         for c in s:
#             if c.isalnum():
#                 newStr += c.lower()
#         return newStr == newStr[::-1]

#isalnum() is a built-in method used in string manipulations in Python.
# The isalnum() method returns “True” if all characters in the string are alphanumeric (either alphabets or numbers).
# If not, it returns “False”.