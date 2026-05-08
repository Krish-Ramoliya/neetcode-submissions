class Solution:
    def isValid(self, s: str) -> bool:
        map = {')':'(' ,'}':'{' ,']':'['}
        stack=[]
        for ch in s:
            if ch in map:
                top = stack.pop() if stack else '#'
                if map[ch]!= top:
                    return False
            else:
                stack.append(ch)

        return not stack