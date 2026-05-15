class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[]
        n=len(nums)

        def backtrack(index,path):
            # reach end 
            if index==n:
                res.append(path[:])
                return

            # include
            path.append(nums[index])
            backtrack(index+1,path)

            # exclude
            path.pop()
            backtrack(index+1,path)

        backtrack(0,[])
        return res
        