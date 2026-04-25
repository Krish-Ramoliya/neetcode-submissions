class Solution {
    public int missingNumber(int[] nums) {

        int comparator = nums.length*(nums.length+1)/2;
        int res = 0;
        for(int i=0;i<nums.length;i++)
        {
            res = res + nums[i];
        }
        if(res==comparator)
        {
            return 0;
        }
        
        return comparator-res;
    }
}
