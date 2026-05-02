class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        n = len(nums)
        res=[]
        no =1 
        for num in range(n):
            for ex in range(n):
                if ex==num:
                    continue
                else:
                    no *= nums[ex]
            res.append(no)
            no=1

        return res