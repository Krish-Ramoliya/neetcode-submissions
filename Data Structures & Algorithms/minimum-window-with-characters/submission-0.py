class Solution:
    def minWindow(self, s: str, t: str) -> str:

        if len(t)>len(s) and t == "":
            return ""

        countT = {}

        for char in t:
            countT[char]= countT.get(char,0)+1

        window={}
        have=0
        need=len(countT)

        res=[-1,-1]
        res_len = float('inf')      
        left=0 

        for right in range(len(s)):
            curr_char = s[right]
            window[curr_char]= window.get(curr_char,0)+1
            if curr_char in countT and window[curr_char]== countT[curr_char]:
                have+=1

            while have == need:   
                window_size = (right-left)+1

                if window_size < res_len :
                    res=[left,right]
                    res_len = window_size

                left_char = s[left]
                window[left_char]-=1

                if left_char in countT and window[left_char] < countT[left_char]:
                    have-=1
                
                left+=1


        left_idx, right_idx = res

        return s[left_idx:right_idx+1] if res_len < float('inf') else ""


                    

        
        