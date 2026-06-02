class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:

        mA = 0
        stack = []

        for i , h in enumerate(heights):
            start = i 
            while stack and stack[-1][-1] > h :
                index , height = stack.pop()
                mA = max(mA, height * (i - index))
                start = index
            
            stack.append((start, h))

        for index , height in stack :
            mA = max(mA, height*(len(heights) - index))

        return mA


        