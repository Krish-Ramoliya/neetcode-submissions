class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;

        while(start<=end)
        {
            if((nums[start]+nums[end])==target)
            {
                if(nums[start]<nums[end])
                {
                    return  new int[]{start+1,end+1};
                }
                else{
                    return   new  int[]{end +1, start+1};
                }
               
            }
            if((nums[start]+nums[end])>target)
            {
                end--;
            }
            else{
                start++;
            }
        }

        return new int[]{-1,-1};
    }
}