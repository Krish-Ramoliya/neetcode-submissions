class Solution {
    public int[] productExceptSelf(int[] nums) {

        int i=0;
        int result=1;
        int flag=0;
        int cnt=0;
        int ans[] = new int [nums.length];
        
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            result = result*nums[i];
            else{
                cnt++;
                flag = i ;
                if(cnt>1) return ans;

            }
        }

        for(i=0;i<nums.length;i++)
        {
            if(cnt==0)
            ans[i]=result/nums[i];
            else if(cnt==1){
                ans[flag]=result;
            }
        }

        return ans;

    }


}  
