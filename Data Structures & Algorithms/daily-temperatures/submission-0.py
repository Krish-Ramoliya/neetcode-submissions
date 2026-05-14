class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n=len(temperatures)
        res = [0]*n
        for i in range(n):
            curr=temperatures[i]
            count=0
            for j in range(i+1,n):
                if temperatures[j]>curr:
                    res[i]=j-i
                    break
        return res
        



        