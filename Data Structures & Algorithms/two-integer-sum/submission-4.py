class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        ans = {}

        for i , num in enumerate(nums):
            diff = target - num
            if diff in ans:
                return [ans[diff],i]
            ans[num]=i
            

        