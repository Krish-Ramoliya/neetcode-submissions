class Solution {
    public int missingNumber(int[] nums) {
        
        int i =0;
        int ans = 0;
        while(i < nums.length)
        {
            int correct = nums[i];
            
            if(correct < nums .length  && nums[i]!=nums[correct])
            {
                swap(nums , i , correct);
            }
            else{
               i++;
            }
        }

          for(i=0;i<nums.length;i++)
            {
                if(nums[i]!=i)
                {
                    return i;
                }
            }

            // case 2

            return nums.length;
    }

    void swap(int nums[],int i,int correct)
    {
            int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct] = temp;
    }

}