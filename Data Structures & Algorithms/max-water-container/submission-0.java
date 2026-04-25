class Solution {
    public int maxArea(int[] nums) {

         List<Integer> numbers = new ArrayList<>();
         int left = 0;
         int right = nums.length-1;
         int max=0;

         while(left<right)
         {
            if(nums[left]<nums[right])
            {
                numbers.add((right-left)*(nums[left]));
                left++;
            }
            else if(nums[left]>nums[right])
            {
                numbers.add((right-left)*(nums[right]));
                right--;
            }
            else{
                numbers.add((right-left)*(nums[left]));
                left++;
            }
         }

        max = Collections.max(numbers);

        return max;
        
    }
}
