class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n= len(nums)
        seek={}
        for index, value in enumerate(nums):
            diff = target - value
            if diff in seek:
                return [seek[diff],index]
            seek[value] = index 
            

        